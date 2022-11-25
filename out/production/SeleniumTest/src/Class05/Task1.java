package Class05;
/*      1.Go to facebook
        2.click on create New Account
        3.Fill out the whole form
        4.Take screenshot of filled out form manually and share in HW channel along with code*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Guljan");
        driver.findElement(By.name("lastname")).sendKeys("Amerhanova");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("guljan.amerhanova@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("guljan.amerhanova@gmail.com");
        driver.findElement(By.cssSelector("input#password_step_input")).sendKeys("123456789");
        WebElement selectDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select day=new Select(selectDay);
        day.selectByIndex(7);
        WebElement selectMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select month=new Select(selectMonth);
        month.selectByValue("3");
        WebElement selectYear = driver.findElement(By.xpath("//select[@id='year']"));
        Select year=new Select(selectYear);
        year.selectByValue("1987");
        WebElement buttonGender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
        buttonGender.click();
        Thread.sleep(3000);
    }
}
