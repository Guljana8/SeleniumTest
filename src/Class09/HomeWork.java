package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//go to the url
        driver.get(properties.getProperty("URL"));
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys(properties.getProperty("userName"));
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys(properties.getProperty("password"));
        WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        button.click();
//click on PIM
        WebElement pimButton = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimButton.click();
//click on Employee List
        WebElement empListBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
        empListBtn.click();
//from the table choose one id (it must be from the first page)
        List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0; i < columnID.size(); i++){
            String textID = columnID.get(i).getText();
            if(textID.equalsIgnoreCase("45137A")){
                int rowNumber=i+1;
//and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
                WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (rowNumber) + "]/td[1]"));
                checkBox.click();
            }
        }
    }
}
