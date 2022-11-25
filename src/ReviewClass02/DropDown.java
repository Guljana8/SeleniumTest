package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //find the button Create Account and click on it
        WebElement createAccountBtn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createAccountBtn.click();
        //sleep for 3 sec. to wait for the window to open up
        Thread.sleep(2000);
        //select the date from the dropDown
        /*approach to use the Select:
        * 1. Find the WebElement that contains the select Tag
        * 2. Use Select class Select sel=new Select(WebElement)
        */
        //1. Find the WebElement that contains the select Tag
        WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
        //2. Use Select class Select sel=new Select(WebElement)
        Select sel=new Select(day);
        //We have now 3 methods
        // 1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
        // 2. Select by visible text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
        // 3. Select by value
        sel.selectByValue("16");
//---------------------------------------------------//
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth =new Select(month);
        selectMonth.selectByVisibleText("Aug");
        //print all the available months in the console
        List<WebElement> options = selectMonth.getOptions(); //=>traverse to for loop and print each WebElement:
        for(int i=0; i< options.size(); i++){
            String months = options.get(i).getText();
            System.out.println(months);
        }






    }
}
