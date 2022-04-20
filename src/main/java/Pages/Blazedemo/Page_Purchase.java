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
    public By title_h2 = By.tagName("h2");
    public By name_input = By.id("inputName");
    public By address_input = By.id("address");
    public By city_input = By.id("city");
    public By state_input = By.id("state");
    public By zipCode_input = By.id("zipCode");
    public By cardType_select = By.id("cardType");
    public By creditCardNumber_input = By.id("creditCardNumber");
    public By creditCardMonth_input = By.id("creditCardMonth");
    public By creditCardYear_input = By.id("creditCardYear");
    public By nameOnCard_input = By.id("nameOnCard");
    public By rememberMe_checkbox = By.id("rememberMe");
    public By purchase_flight_button = By.xpath("/html/body/div[2]/form/div[11]/div/input");//input[@value='Purchase Flight']




    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */
    public boolean title_h2_confirmation(String title){

        return helpers.getText(title_h2).contains(title);
    }

    public void send_name_input(String userName){
        helpers.SendText(name_input, userName);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_address_input(String userAddress){
        helpers.SendText(address_input, userAddress);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_city_input(String userCity){
        helpers.SendText(city_input, userCity);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_state_input(String userState){
        helpers.SendText(state_input, userState);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_zipCode_input(String userZipCode){
        helpers.SendText(zipCode_input, userZipCode);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_cardType_select(String userCardType){
        helpers.SendText(cardType_select, userCardType);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_creditCardNumber_input(String userCreditCardNumber){
        helpers.SendText(creditCardNumber_input, userCreditCardNumber);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_creditCardMonth_input(String userCreditCardMonth){
        helpers.SendText(creditCardMonth_input, userCreditCardMonth);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_creditCardYear_input(String userCreditCardYear){
        helpers.SendText(creditCardYear_input, userCreditCardYear);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void send_nameOnCard_input(String userNameOnCard){
        helpers.SendText(nameOnCard_input, userNameOnCard);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void click_rememberMe_checkbox(){
        helpers.clickBy(rememberMe_checkbox);
        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }

    public void click_purchase_flight_button(){
        helpers.clickBy(purchase_flight_button);
        //driver.findElement(find_flights_button).click();
    }

}
