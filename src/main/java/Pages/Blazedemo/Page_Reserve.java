package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Reserve {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Reserve(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By title_h3 = By.tagName("h3");
    public By choose_this_flight_button = By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input");//input[@value='Choose This Flight']




    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public boolean city_confirmation(String city){
        return helpers.getText(title_h3).contains(city);
    }

    public void choose_this_flight_button(){
        helpers.clickBy(choose_this_flight_button);
    }


}
