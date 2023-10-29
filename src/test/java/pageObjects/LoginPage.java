package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    String pageURL = "https://rozetka.com.ua/ua/";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get(pageURL);
    }

    public WebElement getProfileElement(){
        return getElementByXpath("//button//*[contains(@href, 'icon-user-simple')]");
    }

    public WebElement getEmailField(){
        return getElementByXpath("//input[@id='auth_email']");
    }

    public WebElement getPassField(){
        return getElementByXpath("//input[@id='auth_pass']");
    }

    public WebElement getSubmitLoginBtn(){
        return getElementByXpath("//button[contains(@class, 'auth-modal__submit')]");
    }

    public WebElement getWrongEmailErrorMessage(){
        return getElementByXpath("//input[@id='auth_email']/../p[contains(@class, 'error-message')]");
    }
}
