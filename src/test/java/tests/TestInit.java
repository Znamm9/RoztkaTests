package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void after(){
        driver.quit();
    }
}
