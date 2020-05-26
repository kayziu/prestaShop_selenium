package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpdateAddressAssertionPage {

    WebDriver driver;

    @FindBy(css = ".alert.alert-success")
    WebElement alertSuccess;

    @FindBy(css = ".address-body")
    private List<WebElement> addressList;

    @FindBy(xpath = "//a[@data-link-action='delete-address']")
    private List<WebElement> deleteButton;


    public UpdateAddressAssertionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getAlertAssertion() {
        return alertSuccess.getText();
    }

    public String getAddressData() {
        return addressList.get(addressList.size() -1).getText();
    }

    public void DeleteAddedAddress() {
        deleteButton.get(deleteButton.size() -1).click();
    }

}
