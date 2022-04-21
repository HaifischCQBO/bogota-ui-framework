package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helpers {
    private  WebDriver driver;

    public Helpers() {
        driver = SingletonDriver.getWebDriver();
    }

    public Helpers(WebDriver driver) {
        this.driver = driver;
    }

    public void getURL(String url) {
        Print("Se ingresa a la URL:" + url);
        driver.get(url);
    }

    public void Print(String texto) {
        System.out.println(texto);
    }

    public void ClickBy(By by){
        driver.findElement(by).click();
        Print("Se ha clikeado el elemento " + by);
    }

    public void SendText(By by, String text){
        driver.findElement(by).sendKeys(text);
        Print("Se envía el texto " + text + " al elemento " + by);
    }

    public void getText(By by){
        String text = driver.findElement(by).getText();
        Print("Se obtiene texto " + text + " del elemento " + by);
    }


}
