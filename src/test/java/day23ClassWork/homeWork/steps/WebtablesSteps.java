package day23ClassWork.homeWork.steps;

import day23ClassWork.homeWork.pages.WebtablesPage;
import hometestwork.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebtablesSteps {
    private static final Logger LOGGER =Logger.getLogger(WebtablesSteps.class);
    WebtablesPage webEdite = new WebtablesPage();

    @Given("I go to webtables")
    public void goToUrlStep() {
        Driver.getWebDriver().get("https://demoqa.com/webtables");
    }

    @When("I start checking form edit")
    public void iCheckFormEditStep() {
        webEdite.webEdite();
        webEdite.clickSubmit();
    }

    @Then("I check is form edited")
    public void isFormEditedStep() {
        WebElement elem = Driver.getWebDriver().findElement(By.xpath("//div[text() = 'Lukashok']"));
        Assert.assertEquals("Lukashok",elem.getText());
    }
}
