package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Blazedemo.Page_Confirmation;
import Pages.Blazedemo.Page_Index;
import Pages.Blazedemo.Page_Purchase;
import Pages.Blazedemo.Page_Reserve;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_con_POM extends BaseClass {

    @Test
    public void Take_a_Flight_test() {

        String departure_city= "Mexico City";
        String destination_city= "Berlin";


        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://blazedemo.com/");
        Page_Index page_index = new Page_Index(driver);
        page_index.select_departure_city(departure_city);
        page_index.select_destination_city(destination_city);
        page_index.click_find_flights();


        /**
         * 1. Una funcion que obtenga el elemento desde la pagina -> Page_Reserve
         * 2. Es una funcion para saber si el texto contiene nuestras variables departure y destination city -> Helpers
         *    2b. Retornar un boolean
         *
         * 3. Una validacion por assert para ambas ciudades -> Tests
         * **/
        destination_city= "Berlin";
        Page_Reserve page_reserve = new Page_Reserve(driver);
        Assert.assertTrue(page_reserve.city_confirmation(departure_city), "Departure City displayed isnt the same as the last page");
        Assert.assertTrue(page_reserve.city_confirmation(destination_city), "Destination City displayed isnt the same as the last page");
        page_reserve.click_choose_this_flight_button();

        /**
         * page purchase*/
        Page_Purchase page_purchase = new Page_Purchase(driver);
        String title_h2 = "Your flight from TLV to SFO has been reserved.";

        page_purchase.title_h2_confirmation(title_h2);
        /*boolean confirmation = page_confirmation.title_h2_confirmation(title_h2);
        System.out.println("confirmation = " + confirmation);
        */
        String userName = "Elián Díaz";
        String userAddress = "Universidad";
        String userCity = "Bucaramanga" ;
        String userState = "Santander";
        String userZipCode = "680001";
        String userCardType = "Visa";
        String userCreditCardNumber = "4485715860868875";
        String userCreditCardMonth = "09";
        String userCreditCardYear = "2022";
        String userNameOnCard = "Elián Díaz";

        page_purchase.send_name_input(userName);
        page_purchase.send_address_input(userAddress);
        page_purchase.send_city_input(userCity);
        page_purchase.send_state_input(userState);
        page_purchase.send_zipCode_input(userZipCode);
        page_purchase.send_cardType_select(userCardType);
        page_purchase.send_creditCardNumber_input(userCreditCardNumber);
        page_purchase.send_creditCardMonth_input(userCreditCardMonth);
        page_purchase.send_creditCardYear_input(userCreditCardYear);
        page_purchase.send_nameOnCard_input(userNameOnCard);
        page_purchase.click_rememberMe_checkbox();
        page_purchase.click_purchase_flight_button();

        /**
         * page confirmation*/
        String title_h1 = "Thank you for your purchase today!";
        Page_Confirmation page_confirmation = new Page_Confirmation(driver);
        page_confirmation.title_h1_confirmation(title_h1);
    }
}
