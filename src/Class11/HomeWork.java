package Class11;
/*rightClick  on the button, select edit and handle the alert

double click on the button and handle the alert*/

import Pages.LoginPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximize
        driver.manage().window().maximize();
// go to the website
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickBtn).perform();

        WebElement editBtn = driver.findElement(By.xpath("//span[text()='Edit']"));
        editBtn.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleAlert = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        action.doubleClick(doubleAlert).perform();
        driver.switchTo().alert();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alert.accept();
    }
}
