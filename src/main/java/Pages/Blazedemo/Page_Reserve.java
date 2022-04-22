package Pages.Blazedemo;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class Page_Reserve implements Page {
    private final String URL = Page.URL+"/reserve.php";
    public WebDriver driver;
    public Helpers helpers;
    public By title_h3 = By.tagName("H3");
    public By choose_this_flight_button = By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input");

    public Page_Reserve(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers();
    }

    public void choose_this_flight_button(){
        helpers.ClickBy(choose_this_flight_button);
    }

    public String getInitialsAirlines(String name){
        String[] splitName = name.split(" ");

        StringBuilder initials = new StringBuilder();

        for (int i = 0; i < splitName.length; i++) {
           initials.append(splitName[i].charAt(0)); //Agrego la inicial de cada palabra.
        }

        return  initials.toString().toUpperCase(Locale.ROOT);//Las iniciales están en mayusculas
    }

    /**
     * Los forms deben tener un nombre con las iniciales del nombre de las aereolineas + el numero de vuelo
     * Actualmente hay un error porque el tercer vuelo (#9696) tiene mal su name. debe ser AL9696 pero tiene AL969
     */
    public boolean validateFormName(){
        System.out.println("-! Validando nombre de los formularios... !-");

        List<WebElement> getForms = driver.findElements(By.xpath("//form"));
        List<WebElement> getFlightNumbers = driver.findElements(By.xpath("//tr/td[2]"));
        List<WebElement> getAirlineNames = driver.findElements(By.xpath("//tr/td[3]"));

        if(getForms.size() == getFlightNumbers.size()){
            for(int i = 0; i < getForms.size(); i++){
                String nameAirline = getAirlineNames.get(i).getText();
                String initialsAndNumberFlight = this.getInitialsAirlines(nameAirline) + getFlightNumbers.get(i).getText();

                System.out.println("Nombre del formulario: " + getForms.get(i).getAttribute("name") + " Iniciales y numero de vuelo: " + initialsAndNumberFlight + " ¿Es valido? "+ getForms.get(i).getAttribute("name").equals(initialsAndNumberFlight));

                if(!getForms.get(i).getAttribute("name").equals(initialsAndNumberFlight)){
                     return  false;
                }
            }
            return true; //Tocaría ver si cuando no tienen elementos debería mostar un mensaje o algo así...
        }

        System.out.println("La pagina no contiene ningun formulario.");
        return false;
    }

    public  boolean city_confirmation(String city){
        String title_text = driver.findElement(title_h3).getText();

        return title_text.contains(city);
    }

    @Override
    public String getUrl() {
        return this.URL;
    }
}
