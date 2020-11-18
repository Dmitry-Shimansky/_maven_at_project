package hometestwork.cucumber.steps;

import day19ClassWork.steps.FakeGuiSteps;
import drivers.Driver;
import hometestwork.pages.booking.BookingLoginPage;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookingLoginSteps {

    private BookingLoginPage loginPage = new BookingLoginPage();

    private static final Logger LOGGER =Logger.getLogger(BookingLoginSteps.class);

    @Given("I go to BOOKING.COM")
    public void goToUrlStep() {
        LOGGER.info("I start");
        Driver.getWebDriver().get(ConfigURLs.BOOKING);
    }

    @When("I Login on site")
    public void iLoginOnSiteStep() {
        LOGGER.info("click login button");
        loginPage.clickLoginButton();
        LOGGER.info("I enter Login");
        loginPage.enterLogin(ConfigForLogin.USER_BOOKING_LOGIN);
        LOGGER.info("I click Continue button");
        loginPage.clickContinueButton();
        LOGGER.info("I enter password");
        loginPage.enterPass(ConfigForLogin.USER_BOOKING_PASSWORD);
        LOGGER.info("I sign in button");
        loginPage.clickSignInButton();
    }

    @Then("I verified result as expected")
    public void justPassStep() {
        LOGGER.info("I passed");
        WebElement logoText = hometestwork.driver.Driver.getWebDriver().findElement(By.id("wl252-modal-name"));
        Assert.assertEquals("wl252-modal-name", logoText.getAttribute("id"));
    }
}
