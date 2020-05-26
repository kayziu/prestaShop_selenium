package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {

    WebDriver driver;

    @FindBy(xpath = "//article[@data-id-product='2']")
    WebElement hummingbirdPrintedSweater;

    public ClothesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSweater() {
        hummingbirdPrintedSweater.click();
    }



}
