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
    private By purchaseFlight_button = By.xpath("//input[@value='Purchase Flight']");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void fill_form_purchase() {
        Faker faker = new Faker();
        helpers.SendText(name_input, faker.name().fullName());
        helpers.SendText(address_input, helpers.returnFullAdress());
        helpers.SendText(city_input, faker.address().city() );
        helpers.SendText(state_input, faker.address().state() );
        helpers.SendText(zipCode_input, faker.address().zipCode() );
        helpers.SelectByIndex(cardType_select);
        helpers.SendText(creditCardNumber_input, faker.business().creditCardNumber() );
        helpers.SendText(creditCardMonth_input, String.valueOf(helpers.GetRandomNumber(12)));
        helpers.SendText(creditCardYear_input, String.valueOf(helpers.GetRandomNumber(2050)));
        helpers.SendText(nameOnCard_input, faker.name().fullName());
        helpers.SendText(address_input, helpers.returnFullAdress() );

    }
    public void click_remember_checkbox(){
        helpers.clickBy(rememberMeCheck_checkbox);
    }
    public void click_purchaseFlight_button(){
        helpers.clickBy(purchaseFlight_button);
    }

}