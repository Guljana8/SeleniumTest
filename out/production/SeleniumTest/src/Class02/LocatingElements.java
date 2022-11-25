package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args){
/*got to FB.com
enter username
enter password
click login*/

//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//go to Fb.com
        driver.get("https://www.facebook.com/");
//maximize the window
        driver.manage().window().maximize();
//enter the Username in the textBOX
        // 1.locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abracadbra");
//enter the password in the textBox
        driver.findElement(By.name("pass")).sendKeys(("123456abc"));
//click the login
        driver.findElement(By.name("login")).click();


        //for the following task to work please make sure that you comment the login functionality!

//TASK2
//click on forgot password
       // driver.findElement(By.linkText("Forgotten password?")).click();


        //for the following task to work please make sure that you comment the task 2 and login functionality!

//TASK3
//click on forgot password using Partial linkText locator
        //driver.findElement(By.partialLinkText("Forgotten")).click();




    }
}
