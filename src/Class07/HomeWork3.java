package Class07;
/*
1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
2.Click on start button
3. get the text Welcome Syntax technologies and print on console

the text will be Empty

write down  whatever the reason you understand  of text being empty after exploring DOM*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//1.goto https://syntaxprojects.com/dynamic-elements-loading.php
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");
        driver.manage().window().maximize();
//2.Click on start button
        WebElement startButton = driver.findElement(By.xpath("//button[@id='startButton']"));
        startButton.click();
//3. get the text Welcome Syntax technologies and print on console
        WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax')]"));
        String welcomeText = text.getText();
        System.out.println("The text cannot be print as it is not displayed yet in the window tab"+welcomeText);
    }
}
