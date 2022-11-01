package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[starts-with(@id, 'btn')]")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click(); //correct syntax but not unique -> see review class HM solutions.
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello testing");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
