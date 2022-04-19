package Helpers;

import org.openqa.selenium.WebDriver;

public class Helpers {
    private static WebDriver driver;

    public Helpers(){
    }
    public Helpers(WebDriver driver){
        this.driver = driver;
    }

    public void getURL(String url) {
        Print("Se ingresa a la URL:" + url);
        driver.get(url);
    }
    public void Print(String texto){
        System.out.println(texto);
    }
}
