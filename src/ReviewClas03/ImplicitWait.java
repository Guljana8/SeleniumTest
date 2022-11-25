package ReviewClas03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
       // setting up the webDriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");


        driver.findElement(By.xpath("//button[text()='Get New User']")).click();
//        find the webElement
        WebElement img = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(img.getText());


    }
}
