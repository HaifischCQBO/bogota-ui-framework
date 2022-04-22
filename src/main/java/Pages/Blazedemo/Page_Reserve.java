package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Reserve {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Reserve(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By title_h3 = By.tagName("h3");
    private By buttonChoose1 = By.xpath("//html/body/div[2]/table/tbody/tr[1]/td[1]/input");
    private By buttonChoose2 = By.xpath("//html/body/div[2]/table/tbody/tr[2]/td[1]/input");
    private By buttonChoose3 = By.xpath("//html/body/div[2]/table/tbody/tr[3]/td[1]/input");
    private By buttonChoose4 = By.xpath("//html/body/div[2]/table/tbody/tr[4]/td[1]/input");
    private By buttonChoose5 = By.xpath("//html/body/div[2]/table/tbody/tr[5]/td[1]/input");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public boolean city_confirmation(String city){

        return helpers.getText(title_h3).contains(city);
    }

    public void click_buttonChoose(){
        helpers.clickBy(buttonChoose1);
        //driver.findElement(find_flights_button).click();
    }


}
