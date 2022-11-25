package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();

        //Task 1: Print the animals on screen and then  Select Baby Cat From The dropDown
        //Step1: switch to the frame using by index
         driver.switchTo().frame(1);
        //  find the  text animals and print on screen
         WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));
         String text = animalText.getText();
         System.out.println(text);

         //check the checkBox
        //switch focus to the main page
        driver.switchTo().defaultContent();

        //switch to the frame containing the subFrame which has checkBox
        driver.switchTo().frame("frame1");
       WebElement inputText = driver.findElement(By.xpath("//input"));
       inputText.sendKeys("Abracadabra");

       //finding the frame through xpath and switching using By WebElement method
       WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
       driver.switchTo().frame(frame3);
       WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
       checkBox.click();
    }
}
