package pages.pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
//import sun.security.util.Password;

//import static constants.Constant.AuthTestData.USERNAMEINVALID;
import static constants.Constant.AuthTestDataInvalid.PASSWORDINVALID;
import static constants.Constant.AuthTestDataInvalid.USERNAMEINVALID;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By inputUsername = By.xpath("//input[@type='text']");
    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin = By.xpath("//input[@type='submit']");


    public MobilePhoneReplenishmentPage enterUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
        return this;
    }

    public MobilePhoneReplenishmentPage enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public MobilePhoneReplenishmentPage selectButtonLogin() {
        driver.findElement(buttonLogin).click();
        return this;
    }

    public MobilePhoneReplenishmentPage enterUsernameInvalid(String usernameInvalid){
        driver.findElement(inputUsername).sendKeys(USERNAMEINVALID);
        return this;
    }

    public MobilePhoneReplenishmentPage enterPasswordInvalid(String passwordInvalid) {
        driver.findElement(inputPassword).sendKeys(PASSWORDINVALID);
        return this;
    }
}
