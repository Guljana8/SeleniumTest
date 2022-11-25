package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
    public static void main(String[] args) throws InterruptedException {
//go to google.com
// go to facebook.com
// go back to google.com
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
//go to facebook.com
        driver.navigate().to("https://www.facebook.com/");

//introduce some sleep which is wait
// Wait or pause for 2000 milli seconds (2 seconds)
        Thread.sleep(1000);
//go back to google.com
        driver.navigate().back();
//wait for 2 sec
        Thread.sleep(1000);
//go back to fb.com
        driver.navigate().forward();
//wait for 2 sec
        Thread.sleep(1000);
//refresh the page
        driver.navigate().refresh();
// quit
        driver.quit();
    }
}
