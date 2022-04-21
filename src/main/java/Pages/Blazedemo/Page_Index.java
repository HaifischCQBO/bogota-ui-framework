package Pages.Blazedemo;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index implements Page {
    private final String URL = "https://blazedemo.com/";
    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers();
    }

    /**
     * Aquí se implementa el método getUrl
     */
    @Override
    public String getUrl() {
        return this.URL;
    }

    /**
     * WebElements.
     */
    public By departure_city_select = By.name("fromPort");
    public By destination_city_select = By.name("toPort");
    public By find_fliith_btn = By.xpath("//input[@value='Find Flights']");

    /**
     * Functions
     */

    public void select_departure_city(String city){
        helpers.SendText(departure_city_select,city);
    }

    public void select_destination_city(String city){
        helpers.SendText(destination_city_select,city);
    }

    public void click_find_text(){
        helpers.ClickBy(find_fliith_btn);
    }


}
