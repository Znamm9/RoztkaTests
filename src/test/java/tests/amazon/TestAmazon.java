package tests.amazon;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.amazon.HomePage;
import tests.TestInit;

public class TestAmazon extends TestInit {

    @Test
    public void checkHeader(){
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        Assert.assertTrue(homePage.getLogo().isDisplayed());
    }
}
