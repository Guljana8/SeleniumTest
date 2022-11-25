package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//use the get(); function to open the required website
        driver.get("https://www.google.com/");
        //get the url of the website
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //get the Title
        String title=driver.getTitle();
        System.out.println(title);

        //close the chrome
        driver.quit();


    }
}
