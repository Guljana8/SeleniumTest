package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*HRMS Application Negative Login:
Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

Hint:
you can use if else condition for verification of message
*/
public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
 // Enter valid username
        WebElement boxUser = driver.findElement(By.cssSelector("input#txtUsername"));
        boxUser.sendKeys("Admin");
        //Click on login button
        WebElement button = driver.findElement(By.cssSelector("input#btnLogin"));
        button.click();
        WebElement text = driver.findElement(By.cssSelector("span#spanMessage"));
        String displayText=text.getText();
        if(!displayText.isEmpty()) {
            System.out.println(displayText);
        }
    }
}
