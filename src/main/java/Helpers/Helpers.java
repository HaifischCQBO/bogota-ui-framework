package Helpers;

import org.openqa.selenium.By;
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
    public void clickBy(By by){
        driver.findElement(by).click();
        Print("Se realiza Click a Elemento:"+ by);
    }
    public void SendText(By by, String text){
        driver.findElement(by).sendKeys(text);
        Print("Se envia texto:"+ text + " al elemento: "+ by);
    }
    public String getText(By by) {
        String text = driver.findElement(by).getText();
        Print("Se Obtiene texto: "+ text + " del elemento: "+ by);
        return text;

    }
}
