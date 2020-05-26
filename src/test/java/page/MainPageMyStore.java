package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageMyStore {

    WebDriver driver;

    @FindBy(className = "user-info")
    WebElement signInButton;

    public MainPageMyStore(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signingIn() {
        signInButton.click();
    }

}
