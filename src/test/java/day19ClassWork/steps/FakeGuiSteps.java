package day19ClassWork.steps;

import drivers.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;

public class FakeGuiSteps {

    private static final Logger LOGGER =Logger.getLogger(FakeGuiSteps.class);

    @Given("I go to TUT.BY")
    public void goToUrlStep() {
        LOGGER.info("I start");
        Driver.getWebDriver().get("https://tut.by");
    }

    @When("I start waiting")
    public void iWaitStep() throws InterruptedException {
        LOGGER.info("I wait");
        Thread.sleep(5000);
    }

    @Then("I just passed")
    public void justPassStep() {
        LOGGER.info("I just passed");
        Assert.assertTrue(true);
    }
}
