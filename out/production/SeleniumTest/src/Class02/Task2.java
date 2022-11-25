package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser*/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Guljan");
        driver.findElement(By.name("lastname")).sendKeys("Amerhanova");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
