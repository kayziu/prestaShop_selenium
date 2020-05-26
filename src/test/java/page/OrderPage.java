package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    WebDriver driver;


    @FindBy(name = "confirm-addresses")
    WebElement confirmAddress;

    @FindBy(id = "delivery_option_1")
    WebElement pickupInStoreRadio1;

    @FindBy(id = "delivery_option_2")
    WebElement pickupInStoreRadio2;

    @FindBy(name = "confirmDeliveryOption")
    WebElement confirmDelivery;

    @FindBy(id = "payment-option-1")
    WebElement payByCheckRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement termsAndConditionsTick;

    @FindBy(css = ".btn.btn-primary.center-block")
    WebElement obligationOrderButton;


    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickConfirmAddress() {
        confirmAddress.click();
    }


    public void clickRadio2() {
        pickupInStoreRadio2.click();
    }

    public void clickRadio1() {
        pickupInStoreRadio1.click();
    }

    public void clickConfirmDelivery() {
        confirmDelivery.click();
    }

    public void clickPayByCheck() {
        payByCheckRadio.click();
    }

    public void clickTermsAndConditions() {
        termsAndConditionsTick.click();
    }

    public void clickObligationPayButton() {
        obligationOrderButton.click();
    }


}






