package Tests;

import Baseclass.BaseClass;
import Pages.Blazedemo.Page_Index;
import Pages.Blazedemo.Page_Purchase;
import Pages.Blazedemo.Page_Reserve;
import org.testng.Assert;
import org.testng.annotations.Test;
import Helpers.Helpers;

public class Test_con_POM extends BaseClass {

    @Test
    public void Test1() {
        Page_Index index = new Page_Index();
        Page_Reserve reserve = new Page_Reserve();
        Helpers helpers = new Helpers();

        String departure_city = "Philadelphia";
        String destination_city = "Rome";

        helpers.getURL(index.getUrl());

        //Verifico que se se encuentre realmente en la pagina index.
        Assert.assertEquals(driver.getCurrentUrl(), index.getUrl(), "EL URL ACTUAL NO CORRESPONDE CON EL URL DE LA PAGINA 'INDEX'");

        index.select_departure_city(departure_city);
        index.select_destination_city(destination_city);
        index.click_find_text();

        //verifico si al hacer click lo redireccina a la  pagina de reserve.
        Assert.assertEquals(driver.getCurrentUrl(), reserve.getUrl(), "EL URL ACTUAL NO CORRESPONDE CON EL URL DE LA PAGINA 'RESERVE'");
        Assert.assertTrue(reserve.city_confirmation(departure_city), "LA CIUDAD NO ES CORRECTA");
        //Rectifico que
        //Assert.assertTrue(reserve.validateFormName(),"LOS FORMULARIOS GENERADOS NO TIENEN NOMBRES VALIDOS.");

        reserve.choose_this_flight_button();

        Page_Purchase page_purchase = new Page_Purchase();
        page_purchase.fill_form_purchase();
        page_purchase.click_remember_checkbox();
        helpers.Pause(1);
        page_purchase.click_purchaseFlight_button();

    }




}
