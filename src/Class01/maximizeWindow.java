package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {
        //go to google.com
        //maximize your window

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create instance of WebDriver
        WebDriver driver=new ChromeDriver();
//go to google.com
        driver.get("https://www.google.com/");
//maximize
        driver.manage().window().maximize();
//fullscreen
       // driver.manage().window().fullscreen();
//quit
        driver.quit();
    }
}
