package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_no_POM {

    public WebDriver driver;
    @Test
    public void PrimeraPrueba(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       driver.get("https://blazedemo.com/index.php");
    }

}
