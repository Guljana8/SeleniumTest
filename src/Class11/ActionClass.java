package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximize
        driver.manage().window().maximize();
// go to the website
        driver.get("https://www.amazon.com/");
        WebElement enHover = driver.findElement(By.xpath("//div[text()='EN']"));

//Action class
        Actions action=new Actions(driver);
        action.moveToElement(enHover).perform();

    }
}
