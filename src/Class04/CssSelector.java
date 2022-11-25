package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//goto syntaxprojects.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

        //get the webElement text box
        //driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Abracadabra");
        //another method of doing the above operation
        //findElement is a method that has a return type which is WebElement
        WebElement textBox=driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textBox.sendKeys("Abracadabra");

        //press the button show message
        WebElement button = driver.findElement(By.cssSelector("button[onclick^='showIn']"));
        button.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
