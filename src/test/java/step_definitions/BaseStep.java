package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStep {

    protected WebDriver driver;

    public BaseStep() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();    //uruchomienie przeglądarki
        driver.manage().window().maximize();    //maksymalizacja okna przeglądarki
    }
}