package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*fill out the form
click on register
close the browser*/

    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Blair");
        driver.findElement(By.id("customer.lastName")).sendKeys("Waldorf");
        driver.findElement(By.id("customer.address.street")).sendKeys("1136 Fifth Avenue");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.name("customer.address.state")).sendKeys("USA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10011");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("11-11-11-11");
        driver.findElement(By.id("customer.username")).sendKeys("blaircornellia");
        driver.findElement(By.id("customer.password")).sendKeys("1234abc");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234abc");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}


