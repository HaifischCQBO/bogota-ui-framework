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
    
    public By choose_this_fligth_43_input = By.name("VA43");
    public By choose_this_fligth_234_input = By.name("UA234");
    public By choose_this_fligth_9696_input = By.name("AL969");
    public By choose_this_fligth_12_input = By.name("VA12");
    public By choose_this_fligth_4346_input = By.name("L4346");

    public By name_first_last_input = By.name("inputName");
    public By address_input = By.name("address");
    public By city_anytown_input = By.name("city");
    public By state_input = By.name("state");
    public By zip_code_input= By.name("zipCode");
    public By card_type_select = By.name("cardType");
    public By credit_card_number_input = By.name("creditCardNumber");
    public By month_input = By.name("creditCardMonth");
    public By year_input = By.name("creditCardYear");   
    public By name_on_card_input = By.name("nameOnCard");
    public By remember_me_checkbox_input = By.name("rememberMe");
    public By purchase_fligths_button = By.xpath("//input[@value='Purchase Fligths']")



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void select_departure_city(String city){
        helpers.SendText(departure_city_select, city);
       //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void select_destination_city(String city){
        helpers.SendText(destination_city_select, city);
        //driver.findElement(destination_city_select).sendKeys("Berlin");
    }

    public void click_find_flights(){
        helpers.clickBy(find_flights_button);
        //driver.findElement(find_flights_button).click();
    }

}
