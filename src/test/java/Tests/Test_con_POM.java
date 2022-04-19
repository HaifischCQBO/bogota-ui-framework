package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {


    @Test
    public void Test1(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://blazedemo.com/");
    }
}
