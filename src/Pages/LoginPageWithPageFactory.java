package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id = "txtUsername")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='txtUsername']")
    public WebElement passwordField;

    @FindBy (css ="input#btnLogin")
    public WebElement loginBtn;

//call the constructor to initialise all elements
    public  LoginPageWithPageFactory(){
        PageFactory.initElements(driver, this);
    }

}
