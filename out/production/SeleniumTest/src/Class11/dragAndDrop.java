package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//maximize
        driver.manage().window().maximize();
// go to the website
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement draggableElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action = new Actions(driver);
    //=>    action.dragAndDrop(draggableElement,dropLocation).perform();
        action.clickAndHold(draggableElement).moveToElement(dropLocation).release().build().perform();
    }
}
