package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//goto syntax projects /check boxes
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        //find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        //click on it
        checkBox.click();

    }
}
