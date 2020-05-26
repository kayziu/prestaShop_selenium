package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import page.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;


public class StepDefi extends BaseStep {

    UpdateAddressAssertionPage updateAddressAssertionPage = new UpdateAddressAssertionPage(driver);
    YourAccountPage yourAccountPage = new YourAccountPage(driver);

    private String address;
    private String alias;
    private String zipcode;
    private String city;

    private static final String EMAIL = "ziomek234@rr.pl";
    private static final String PASSWORD = "hello";

    @Given("User is on the mainpage and clicks SignIn")
    public void userIsOnTheMainpageAndClicksSignIn() {
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        MainPageMyStore mainPageMyStore = new MainPageMyStore(driver);
        mainPageMyStore.signingIn();
    }

    @When("User is logging in to the shop with valid data")
    public void userIsLoggingInToTheShopWithValidData() {
        LogInToYourAccountPage logInToYourAccountPage = new LogInToYourAccountPage(driver);
        logInToYourAccountPage.loggingAs(EMAIL, PASSWORD);
    }


    @When("User is adding new address with proper data: alias (.*), addresses (.*), zipcode (.*), city (.*)")
    public void userIsAddingNewAddressWithProperDataAliasAliasAddressesAddressZipcodeZipcodeCityCity(String alias,
                                                                                                     String address,
                                                                                                     String zipcode,
                                                                                                     String city) {
        yourAccountPage.clickAddresses();
        this.address = address;
        this.alias = alias;
        this.zipcode = zipcode;
        this.city = city;
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.sendAlias(alias);
        newAddressPage.sendAddress(address);
        newAddressPage.sendZipcode(zipcode);
        newAddressPage.sendCity(city);
        newAddressPage.selectDropedown();
        newAddressPage.clickSubmitButton();
    }

    @And("User is checking whether given data has been filled correctly")
    public void userIsCheckingWhetherGivenDataHasBeenFilledCorrectly() {
        assertEquals("Address successfully added!", updateAddressAssertionPage.getAlertAssertion());
        String addressData = updateAddressAssertionPage.getAddressData();
        Assert.assertTrue(addressData.contains(address));
        Assert.assertTrue(addressData.contains(alias));
        Assert.assertTrue(addressData.contains(zipcode));
        Assert.assertTrue(addressData.contains(city));
    }

    @And("User deletes the added address")
    public void userDeletesTheAddedAddress() {
        updateAddressAssertionPage.DeleteAddedAddress();
        assertEquals("Address successfully deleted!", updateAddressAssertionPage.getAlertAssertion());

    }

    // order feature


    @When("User is adding a sweater to the cart: size (.*), quantity (.*)")
    public void userIsAddingASweaterToTheCartSizeSizeQuantityQuantity(String size, String quantity) {
        yourAccountPage.clickClothesButton();
        ClothesPage clothesPage = new ClothesPage(driver);
        clothesPage.clickSweater();

        SweaterPage sweaterPage = new SweaterPage(driver);

        sweaterPage.selectSize(size);
        sweaterPage.selectQuantity(quantity);
        sweaterPage.clickAddToCart();
        sweaterPage.clickClosePreview();
        sweaterPage.clickCartButton();
    }

    @When("User click proceed to checkout")
    public void userClickProceedToCheckout() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickCheckout();

    }

    @When("User proceed the order")
    public void userProceedTheOrder() {
        OrderPage orderPage = new OrderPage(driver);

        orderPage.clickConfirmAddress();
        orderPage.clickRadio2();
        orderPage.clickRadio1();
        orderPage.clickConfirmDelivery();
        orderPage.clickPayByCheck();
        orderPage.clickTermsAndConditions();
        orderPage.clickObligationPayButton();

    }


    @Then("User makes a screenshot of a webpage")
    public void userMakesAScreenshotOfAWebpage() throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "jpg", new File("/home/kay/Dokumenty/fullimage.jpg"));
    }
}
