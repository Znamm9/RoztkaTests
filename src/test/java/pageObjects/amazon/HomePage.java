package pageObjects.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class HomePage extends BasePage {

    String pageURL = "http://amazon.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        driver.get(pageURL);
    }

    public WebElement getLogo(){
        return getElementByXpath("//a[contains(@id, 'nav-logo')]");
    }
}
