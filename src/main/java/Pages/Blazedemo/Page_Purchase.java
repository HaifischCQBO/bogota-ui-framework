package Pages.Blazedemo;

import Helpers.Helpers;
import com.github.javafaker.Faker;
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
    private By name_input = By.name("inputName");
    private By address_input = By.name("address");
    private By city_input = By.name("city");
    private By state_input = By.name("state");
    private By zipCode_input = By.name("zipCode");
    private By cardType_select = By.name("cardType");
    private By creditCardNumber_input = By.name("creditCardNumber");
    private By creditCardMonth_input = By.name("creditCardMonth");
    private By creditCardYear_input = By.name("creditCardYear");
    private By nameOnCard_input = By.name("nameOnCard");
    private By rememberMeCheck_checkbox = By.name("rememberMe");
    private By purchaseFlight_button = By.xpath("//input[@value='Purchase Flight']"); // xpath dinamico


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void fill_form_purchase (){  //METODO PARA RELLENAR UN FORMULARIO
        Faker faker = new Faker();

        helpers.SendText(name_input, faker.name().fullName()); //rellena el input con un nombre random
        helpers.SendText(address_input, helpers.returnFullAdress()); //rellena el input con una direccion random
        helpers.SendText(city_input, faker.address().city()); //rellena el input con una ciudad random
        helpers.SendText(state_input, faker.address().city()); //rellena el input con un estado random
        helpers.SendText(zipCode_input, faker.address().zipCode()); //rellena el input con un zipcode random
        helpers.SelectByIndex(cardType_select); //selecciona una de la opciones de manera aleatoria
        helpers.SendText(creditCardNumber_input, faker.business().creditCardNumber()); //rellena el input con un numero de tarjeta de credito random
        helpers.SendText(creditCardMonth_input, String.valueOf(helpers.GetRandomNumber(12))); //rellena el input con un numero de mes random
        helpers.SendText(creditCardYear_input, String.valueOf(helpers.GetRandomNumber(2050))); //rellena el input con un numero de año random
        helpers.SendText(nameOnCard_input, faker.name().fullName()); //rellena el input con un nombre para la tarjeta random


        //driver.findElement(departure_city_select).sendKeys("Mexico City");
    }
    public void click_remember_checkbox(){
        helpers.clickBy(rememberMeCheck_checkbox);
    }
    public void click_purchaseFlight_button(){
        helpers.clickBy(purchaseFlight_button);
    }

}



