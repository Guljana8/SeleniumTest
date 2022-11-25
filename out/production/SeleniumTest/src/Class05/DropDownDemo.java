package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) throws InterruptedException {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//goto syntax projects /dropDown
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
//find the WebElement dropDown by looking for select tag
      WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));
//use Select class
        Select select=new Select(dropDown);
//Select an option by index
        select.selectByIndex(5);
        Thread.sleep(3000);
//select by visible Text
        select.selectByVisibleText("Saturday");
        Thread.sleep(3000);
//select by value
        select.selectByValue("Sunday");


//Get all the options available in the dropdown
        List<WebElement> options = select.getOptions();

        //traverse though the options
        for(int i=0; i< options.size(); i++){
          WebElement option = options.get(i);
          String text=option.getText();
          if(text.equalsIgnoreCase("Friday")){
              select.selectByIndex(i);
          }

        }
    }
}
