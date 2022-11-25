package Class07;
/*1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your username in form
Hint1:
u can save the window handle in variables for later use*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HomeWork1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
//1.goto http://accounts.google.com/signup
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
//2.click on help and privacy btn
        WebElement helpButton = driver.findElement(By.xpath("//a[text()='Help']"));
        helpButton.click();
        WebElement privacyButton = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyButton.click();

        String tabGmail = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for( String handle : allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                System.out.println("Displayed text is : "+title);
                break;
            }
        }
//3.click on community Button
        WebElement communityButton = driver.findElement(By.xpath("//a[text()='Community']"));
        communityButton.click();
//4.goto gmail.com page and enter your username in form
        driver.switchTo().window(tabGmail);
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("Flower");
    }
}
