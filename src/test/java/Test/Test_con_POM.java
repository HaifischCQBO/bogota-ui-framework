package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
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
        destination_city= "Berlin2";
        Page_Reserve page_reserve = new Page_Reserve(driver);
        Assert.assertTrue(page_reserve.city_confirmation(departure_city), "Departure City displayed isnt the same as the last page");
        Assert.assertTrue(page_reserve.city_confirmation(destination_city), "Destination City displayed isnt the same as the last page");
       /* page_reserve.click_buttonChoose();

        Page_Purchase page_purchase = new Page_Purchase(driver);
        page_purchase.insert_name("Jhon Ramos");
        page_purchase.insert_city("Tunja");
        page_purchase.click_rememberMeCheck();
       //page_purchase.click_purchaseFlight();*/

    }
}
