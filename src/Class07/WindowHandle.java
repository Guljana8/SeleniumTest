package Class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
//Task : goto gmail signup and get the window handle

//       goto gmail signup page
        driver.get("http://accounts.google.com/signup");
        driver.manage().window().maximize();
        //get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

        //print
        System.out.println("The handle of the current page is: "+gmailHandle);
    }
}
