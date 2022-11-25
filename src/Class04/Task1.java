package Class04;
/*Open Chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
// Enter valid username (username - Admin)
        WebElement boxUser = driver.findElement(By.cssSelector("input#txtUsername"));
        boxUser.sendKeys("Admin");
//Enter password (password - Hum@nhrm123)
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
//Click on login button
        WebElement button = driver.findElement(By.cssSelector("input#btnLogin"));
        Thread.sleep(2000);
        button.click();
//Then verify the message "Welcome Admin"
        WebElement textButton=driver.findElement(By.xpath("//a[@id='welcome']"));
        boolean displayedText=textButton.isDisplayed();
        System.out.println("The value of the attribute Welcome Admin is: "+displayedText);
    }
}
