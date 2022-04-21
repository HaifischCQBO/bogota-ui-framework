package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Purchase {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Purchase(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By title_h3 = By.tagName("h3");
    public By inputName = By.name("inputName");
    public By address = By.name("address");
    public By city = By.name("city");
    public By state = By.name("state");
    public By zipCode = By.name("zipCode");
    public By cardType = By.name("cardType");
    public By creditCardNumber = By.name("creditCardNumber");
    public By creditCardMonth = By.name("creditCardMonth");
    public By creditCardYear = By.name("creditCardYear");
    public By nameOnCard = By.name("nameOnCard");
    public By rememberMeCheck = By.name("rememberMe");
    public By purchaseFlight = By.xpath("//html/body/div[2]/form/div[11]/div/input");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void insert_name (String nombre){
        helpers.SendText(inputName, nombre);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void insert_city (String city){
        helpers.SendText(this.city, city);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void click_purchaseFlight(){
        helpers.clickBy(purchaseFlight);
        //driver.findElement(find_flights_button).click();
    }
    public void click_rememberMeCheck(){
        helpers.clickBy(rememberMeCheck);
        //driver.findElement(find_flights_button).click();
    }

}

