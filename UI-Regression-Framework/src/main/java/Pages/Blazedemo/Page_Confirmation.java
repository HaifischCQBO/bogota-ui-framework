package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Confirmation {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Confirmation(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By title_h1 = By.tagName("h1");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */
    public boolean title_h1_confirmation(String title){

        return helpers.getText(title_h1).contains(title);
    }

}
