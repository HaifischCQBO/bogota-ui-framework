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

        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        Page_Index page_index = new Page_Index(driver);
        String departure_city = page_index.select_departure_city();
        String destination_city = page_index.select_destination_city();
        page_index.click_find_flights();

        /**
         * 1. Una funcion que obtenga el elemento desde la pagina -> Page_Reserve
         * 2. Es una funcion para saber si el texto contiene nuestras variables departure y destination city -> Helpers
         *    2b. Retornar un boolean
         *
         * 3. Una validacion por assert para ambas ciudades -> Tests
         * **/
        Page_Reserve page_reserve = new Page_Reserve(driver);
        Assert.assertTrue(page_reserve.city_confirmation(departure_city), "Departure City displayed isnt the same as the last page");
        Assert.assertTrue(page_reserve.city_confirmation(destination_city), "Destination City displayed isnt the same as the last page");
        page_reserve.choose_this_flight_button();

        Page_Purchase page_purchase = new Page_Purchase(driver);
        page_purchase.fill_form_purchase();


        page_purchase.click_remember_checkbox();
        //helpers.Pause(10);
        page_purchase.click_purchaseFlight_button();

        Page_Confirmation page_confirmation = new Page_Confirmation(driver);
        Assert.assertTrue(page_confirmation.post_sale_confirmation(), "The sale failed.");


    }
}
