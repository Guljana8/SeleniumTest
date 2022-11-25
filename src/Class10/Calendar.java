package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.delta.com/");
        WebElement agreeBtn = driver.findElement(By.xpath("//button[@class='btn-danger gdpr-banner-btn gdpr-banner-accept-btn']"));
        agreeBtn.click();

        WebElement calender = driver.findElement(By.xpath("//span[text()='Depart']"));
        calender.click();
        //get the month and check if it's the desired month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound=false;
        while (!isFound){
            String monthName =month.getText();
            if(monthName.equalsIgnoreCase("March")){
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
//               traverse through the list to find your desired date
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("20")){
                        date.click();
                        break;
                    }
                }
                System.out.println("i have found the desried month :" +monthName);
                isFound=true;
            }
            else{
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }
        }
    }
}
