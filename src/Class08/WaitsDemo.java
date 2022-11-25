package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
    public static void main(String[] args) {
//  set the path to the driver to link it with our class on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
// create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//  go to https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        //click on the button "change text to Selenium Webdriver"
        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button1.click();
        //get the text Selenium WebDriver
        WebElement webDriverText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        System.out.println(webDriverText.getText());


        //Task2:
        //click on the "display text after 10 seconds" button
        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        button2.click();


/*As the button appears up after some time so in order to click it or get a text from
  it, we need to define some explicit wait*/

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        WebElement visibleButton = driver.findElement(By.xpath("//button[@id='hidden']"));
        visibleButton.click();
    }
}
