package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        //find the button "Click me" for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();
        Thread.sleep(2000);

        //Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

        //Find the button for confirmation Alert and click on it
      WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
      confirmationAlert.click();

      Alert confirmationAlert1 = driver.switchTo().alert();
      confirmationAlert1.dismiss();

      //Find the prompt alert, send some text tehn accept it
       WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
       promptAlert.click();
       //switch the focus to the Alert
      Alert prompt = driver.switchTo().alert();
      prompt.sendKeys("abracadabra");
      prompt.accept();

    }
}
