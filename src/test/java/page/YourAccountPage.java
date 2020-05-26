package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {

    WebDriver driver;

    @FindBy(id = "addresses-link")
    WebElement addressEsLink;

    @FindBy(xpath = "//div[@class='addresses-footer']/a")
    WebElement createNewAddressButton;

    @FindBy(id = "category-3")
    WebElement clothesButton;

    public YourAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickAddresses() {
        addressEsLink.click();
        createNewAddressButton.click();
    }

    public void clickClothesButton() {
        clothesButton.click();
    }
}
