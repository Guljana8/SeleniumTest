package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//goto syntaxprojects.com Radio buttons
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //find the webElement button
        WebElement button=driver.findElement(By.cssSelector("button#buttoncheck"));
        //get the text from webElement
        String text = button.getText();
        System.out.println("The value of the attribute text is: "+text);

        //get the value of the attribute "id" from this WebElement
        String idValue = button.getAttribute("id");
        System.out.println("The value of the attribute id is: "+idValue);
}
}
