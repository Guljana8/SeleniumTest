package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableBasic {
    public static void main(String[] args) {
        //  set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//  go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        //print the whole table on the console
        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String textAllTable = allTable.getText();
        //System.out.println(textAllTable);
//Print all the rows from the table
        //Modification: -> print all the rows which have the company Google
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));//->we call it row-level xpath
        for( WebElement row : rows){
            String rowText = row.getText();
           /* System.out.println(rowText);
            System.out.println("------------------");*/

            //Modified task: print all the rows which have the company Google
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }

//Print all individual columns from the table
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for( WebElement column : columns){
           String columnAllText = column.getText();
            System.out.println(columnAllText);
            System.out.println("------------------");
        }

    }
}
