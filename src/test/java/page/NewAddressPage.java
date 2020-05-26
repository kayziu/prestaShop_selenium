package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAddressPage {

    WebDriver driver;

    @FindBy(name = "alias")
    WebElement aliasField;

    @FindBy(name = "address1")
    WebElement addressField;

    @FindBy(name = "postcode")
    WebElement postcodeField;

    @FindBy(name = "city")
    WebElement cityField;

    @FindBy (name = "id_country")
    WebElement countryDropedown;

    @FindBy(css = ".btn.btn-primary.float-xs-right")
    WebElement submitButton;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void sendAlias(String alias) {
        aliasField.sendKeys(alias);
    }

    public void sendAddress(String address) {
        addressField.sendKeys(address);
    }

    public void sendZipcode(String zipcode) {
        postcodeField.sendKeys(zipcode);
    }

    public  void sendCity(String city) {
        cityField.sendKeys(city);
    }

    public void selectDropedown() {
        Select Dropedown = new Select(countryDropedown);
        Dropedown.selectByValue("17");
    }

    public void clickSubmitButton(){
        submitButton.click();
    }


}
