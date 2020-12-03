package day23ClassWork.homeWork.steps;

import day23ClassWork.homeWork.pages.TextBoxPage;
import day23ClassWork.homeWork.tests.TextBoxTest;
import hometestwork.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxSteps {
    private static final Logger LOGGER =Logger.getLogger(TextBoxTest.class);
    private TextBoxPage textBox = new TextBoxPage();

    @Given("I go to text-box")
    public void goToUrlStep() {
        Driver.getWebDriver().get("https://demoqa.com/text-box");
    }

    @When("I start checking text box")
    public void iCheckTextBoxStep() {
        textBox.fillFields();
        textBox.clickSubmitButton();
    }

    @Then("I check is element displayed")
    public void isElementDisplayedStep() {
        WebElement checkElem = Driver.getWebDriver().findElement(By.id("output"));
        Assert.assertTrue(checkElem.isDisplayed());
    }
}
