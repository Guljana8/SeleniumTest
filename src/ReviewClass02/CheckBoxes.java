package ReviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//find the checkBoxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='color']"));
//what does this list contains? => it contains 6 WebElements
        for(WebElement checkBox : checkBoxes){
          String color = checkBox.getAttribute("value");
          if(color.equalsIgnoreCase("blue")){
              checkBox.click();
              break;
          }
        }
    }
}
