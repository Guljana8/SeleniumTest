package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a WebDriver instance
        WebDriver driver=new ChromeDriver();
//goto syntax HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        //When user sends in the username Admin
        WebElement userName = driver.findElement(By.id("txtUsername"));
        //send the username
        userName.sendKeys("Admin");

        //Then user sends in the wrong password
     WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
     password.sendKeys("abracadabra");

     //Then user clicks on login button
     WebElement btn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
     btn.click();

//     Then VERIFY THT THE ERROR "Invalid credentials" has displayed on the screen
        //get the error message from the DOM
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error = errorMsg.getText();

        //Verification
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("The correct Error message is there ---> verified");
        }else{
            System.out.println("The correct Error message is not there");
        }
    }
}
