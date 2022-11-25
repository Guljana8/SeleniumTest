package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(properties.getProperty("URL"));
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys(properties.getProperty("userName"));
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys(properties.getProperty("password"));
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        WebElement recruitmentBtn = driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recruitmentBtn.click();
        WebElement calendar=driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calendar.click();
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(month);
        select.selectByVisibleText("Aug");
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(year);
        select1.selectByValue("2023");
        List<WebElement> day = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for( WebElement date :day){
           String currentDay= date.getText();
           if(currentDay.equalsIgnoreCase("23")){
               date.click();
               break;
           }
        }
    }
}
