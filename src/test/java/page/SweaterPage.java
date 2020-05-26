package page;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SweaterPage {

    WebDriver driver;

    @FindBy(id = "group_1")
    WebElement dropedownSizes;

    @FindBy(id = "quantity_wanted")
    WebElement quantityField;

    @FindBy(css = ".btn.btn-primary.add-to-cart")
    WebElement addToCart;

    @FindBy(css = ".close")
    WebElement closePreview;

    @FindBy(css = ".blockcart.cart-preview.active")
    WebElement cartButton;



    public SweaterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void selectSize(String size) {

        Select dropedown = new Select(dropedownSizes);
        dropedown.selectByVisibleText(size);

    }

    public void selectQuantity(String quantity) {
        quantityField.click();
        quantityField.clear();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(quantityField));
        quantityField.sendKeys(quantity);
    }

    public void clickAddToCart(){
        addToCart.click();
    }

    public void clickClosePreview(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(closePreview));
        closePreview.click();
    }

    public void clickCartButton(){
        cartButton.click();
    }


}
