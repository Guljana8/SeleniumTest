package Class08;
/*go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textBox is enabled
enter text and click disable
verify the textBox is disabled*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement button = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        button.click();

        WebElement text = driver.findElement(By.xpath("//p[@id='message']")); //p[text()="It's gone"]
        System.out.println(text.getText());
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement enableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enableBtn.click();
        enableBtn.isEnabled();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement textEnable = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(textEnable.getText());
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("Hello");
        WebElement disableBtn = driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disableBtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement textDisable = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println(textDisable.getText());
    }
}
