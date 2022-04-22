package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By departure_city_select = By.name("fromPort");
    public By destination_city_select = By.name("toPort");
    public By find_flights_button = By.xpath("//input[@value='Find Flights']");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public String select_departure_city(){
        return helpers.SelectByIndex(departure_city_select);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public String select_destination_city(){
        return helpers.SelectByIndex(destination_city_select);
        //driver.findElement(destination_city_select).sendKeys("Berlin");
    }

    public void click_find_flights(){
        helpers.clickBy(find_flights_button);
        //driver.findElement(find_flights_button).click();
    }

}