package Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorHighlight {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximize
        driver.manage().window().maximize();
// go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //find the webElement userName
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

        JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("arguments[0].style.backgroundColor='pink'", username);
        js.executeScript("arguments[0].style.border='10px dotted orange'", username);
    }
}
