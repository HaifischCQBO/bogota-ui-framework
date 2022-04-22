package Baseclass;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;
    Helpers helpers = new Helpers();

    @BeforeMethod
    public void setUp(){
        driver = SingletonDriver.getWebDriver();
        SingletonDriver.setCloseWhenFinished(false);
    }

    @AfterMethod
    public void Finished(){
        if(SingletonDriver.getCloseWhenFinished())
            driver.quit();
    }


}