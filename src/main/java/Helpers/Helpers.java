package Helpers;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Helpers { //hola
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
        WebElement elemento = driver.findElement(by);
        elemento.clear();
        elemento.sendKeys(text);
        Print("Se envia texto:"+ text + " al elemento: "+ by);
    }
    public String getText(By by) {
        String text = driver.findElement(by).getText();
        Print("Se Obtiene texto: "+ text + " del elemento: "+ by);
        return text;

    }

    public void Pause(int seconds){ //metodo para crear delays entre cada proceso de prueba
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String returnFullAdress(){  //genera una direccion random
        Faker f = new Faker();
        String street = f.address().streetAddress();
        String appartment = f.address().secondaryAddress();
        String address = street + " " + appartment;

        return address;
    }

    //Para los selectores

    public String SelectByOptionValue(By by, String value){

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

        return select.getFirstSelectedOption().getText();
    }
    public String SelectByVisibleText(By by, String text){

        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

        return select.getFirstSelectedOption().getText();
    }

    public String SelectByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

        return select.getFirstSelectedOption().getText();
    }

    public String SelectByIndex(By by){
        Random r = new Random();

        Select select = new Select(driver.findElement(by));
        int option_number = select.getOptions().size();
        int index_option = r.nextInt(option_number-1);

        select.selectByIndex(index_option);

        return select.getFirstSelectedOption().getText();
    }

    //generar un numero random

    public int GetRandomNumber(int bound){
        Random numeroRandom = new Random();
        return numeroRandom.nextInt(bound);
    }



}
