package day23ClassWork.homeWork.steps;

import day23ClassWork.homeWork.pages.RadioButtonPage;
import hometestwork.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonSteps {
    RadioButtonPage radioButton = new RadioButtonPage();
    private static final Logger LOGGER =Logger.getLogger(RadioButtonSteps.class);

    @Given("I go to radio-button")
    public void goToUrlStep() {
        Driver.getWebDriver().get("https://demoqa.com/radio-button");
    }

    @When("I start checking radio button")
    public void iCheckRadioButtonStep() {
        radioButton.chooseRadioButton();
    }

    @Then("I check is radio button work")
    public void isRadioButtonWorkStep() {
        WebElement radioButtonElem = Driver.getWebDriver().findElement(By.xpath("//span[@class = 'text-success']"));
        Assert.assertEquals("Impressive", radioButtonElem.getText());
    }
}
