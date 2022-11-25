package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
//goto https://chercher.tech/practice/frames
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
//1.check the checkBox
        WebElement frameTopic = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameTopic);

        WebElement frameCheckBox = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frameCheckBox);
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();
//2.Select BabyCat from dropDown
        driver.switchTo().defaultContent();
       WebElement frameDropDown = driver.findElement(By.xpath("//iframe[@id='frame2']"));
       driver.switchTo().frame(frameDropDown);
       WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
       Select textDropDown = new Select(dropDown);
        textDropDown.selectByValue("babycat");
        //3. Send text in text box "DONE"
        driver.switchTo().defaultContent();
        WebElement textBox = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(textBox);
       WebElement inputText= driver.findElement(By.xpath("//input"));
        inputText.sendKeys("DONE");
    }
}
