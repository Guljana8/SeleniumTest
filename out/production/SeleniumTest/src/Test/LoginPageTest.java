package Test;

import Pages.LoginPage;
import utils.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
//Call the method  from the utils
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//create an Object for a Login class
        LoginPage login =new LoginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();
    }
}
