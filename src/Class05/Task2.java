package Class05;
/*
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see categories mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        WebElement downDrop = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select=new Select(downDrop);
        List<WebElement> categories = select.getOptions();
        for(WebElement allCategories : categories){
          String text=allCategories.getText();
            System.out.println(text);

            if(text.equalsIgnoreCase("Computers/Tablets & Networking")){
                select.selectByVisibleText("Computers/Tablets & Networking");
            }
        }
        System.out.println("---------------");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        WebElement text = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        String title = text.getText();
        if(title.equalsIgnoreCase("Computers & Accessories")){
            System.out.println("The title is correct");
        }else{
            System.out.println("The title should be Computers & Accessories");
        }
    }
}
