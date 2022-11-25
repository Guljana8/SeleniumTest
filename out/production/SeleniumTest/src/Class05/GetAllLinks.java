package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//goto ebay.com
        driver.get("https://www.ebay.com/");
//get all the links i.e. anchor tags from the website
        List<WebElement> ebayLinks=driver.findElements(By.tagName("a"));
// print the size of the list
        System.out.println("The size of the list is : "+ ebayLinks.size());
        //implementing a for loop to traverse through the list of WebElements
        for(WebElement ebayLink : ebayLinks){
            String link=ebayLink.getAttribute("href");
            System.out.println(link);
        }

    }
}
