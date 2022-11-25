package Class07;
/*1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php

2. click on get New User
3. get the firstname  of user and print it on console*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//1.goto https://syntaxprojects.com/dynamic-data-loading-demo.php
        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");
        driver.manage().window().maximize();
//2. click on get New User
        WebElement newUser = driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUser.click();
//get the firstname  of user and print it on console
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));
        String name = firstName.getText();
        System.out.println("First name :"+name);
    }
}
