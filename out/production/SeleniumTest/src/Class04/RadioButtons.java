package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
//set the path to the driver to link it with our class(on Windows add .exe at the end )
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
//create a Webdriver instance
        WebDriver driver=new ChromeDriver();
//goto syntaxprojects.com Radio buttons
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        //get the radio button Male
        WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
        //check if the radio button is displayed
        boolean displayStatus=maleRadioBtn.isDisplayed();
        //print the display status
        System.out.println("The radio button is  Displayed: "+displayStatus);

        //check weather the radio button Male is Enabled
        boolean enableStatus=maleRadioBtn.isEnabled();
        System.out.println("The radion button is Enabled: "+enableStatus);

        //check weather the radio button Male is Selected
        boolean selectStats=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected: "+selectStats);

        //check if the radio button Male is not selected then click on it
        if(!selectStats){
            //perform a click operation on the radio button
            maleRadioBtn.click();
        }
        selectStats=maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected: "+selectStats);
    }
}
