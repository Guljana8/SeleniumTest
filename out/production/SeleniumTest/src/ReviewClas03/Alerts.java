package ReviewClas03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) {
// setting up the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
// create an instance
        WebDriver driver= new ChromeDriver();
//open the https://demoqa.com/alerts" Alerts
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
//click on the buttons
        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertBtn1.click();
//alert interface
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

//alert btn 3
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
        alertBtn3.click();

//send text
//driver.switchTo().alert();--> instead of re-writing it we can simply re-use already declared alert.
        alert1.sendKeys("Abracadabra");
        alert1.accept();

    }
}
