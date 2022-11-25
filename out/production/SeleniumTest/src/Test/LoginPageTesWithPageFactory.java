package Test;

import Pages.LoginPageWithPageFactory;
import utils.CommonMethods;

public class LoginPageTesWithPageFactory {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login =new LoginPageWithPageFactory();
        login.userName.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginBtn.click();
    }
}
