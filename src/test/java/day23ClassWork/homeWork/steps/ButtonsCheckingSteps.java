package day23ClassWork.homeWork.steps;

import day23ClassWork.homeWork.pages.ButtonsCheckingPage;
import hometestwork.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ButtonsCheckingSteps {
    ButtonsCheckingPage buttonsChecking = new ButtonsCheckingPage();
    private static final Logger LOGGER =Logger.getLogger(ButtonsCheckingSteps.class);

    @Given("I go to buttons")
    public void goToUrlStep() {
        Driver.getWebDriver().get("https://demoqa.com/buttons");
    }

    @When("I start checking buttons")
    public void iCheckButtonsStep() {
        buttonsChecking.clickDoubleButton();
        buttonsChecking.clickRightButton();
        buttonsChecking.clickClickMeButton();
    }

    @Then("I check is buttons work")
    public void isButtonsWorkStep() {
        WebElement elem = Driver.getWebDriver().findElement(By.id("dynamicClickMessage"));
        Assert.assertEquals("You have done a dynamic click",elem.getText());
    }
}
