package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;
    final int basicWaitTime = 15; //15 seconds

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void sleep(int miliseconds){
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public WebElement getElementByXpath(String locator){
        return new WebDriverWait(driver, Duration.ofSeconds(basicWaitTime)).until(
                ExpectedConditions.elementToBeClickable(By.xpath(locator))
        );
    }
}
