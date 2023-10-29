package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TestLogin extends TestInit{

    @Test
    public void checkLoginForm(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigate();
        loginPage.getProfileElement().click();
        loginPage.getEmailField().sendKeys("test123");
        loginPage.getPassField().sendKeys("123123123");
        loginPage.getSubmitLoginBtn().click();

        Assert.assertTrue(loginPage.getWrongEmailErrorMessage().isDisplayed());
    }
}
