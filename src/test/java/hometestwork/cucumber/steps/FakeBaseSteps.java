package hometestwork.cucumber.steps;

import hometestwork.driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;


public class FakeBaseSteps {

    private static final Logger LOGGER =Logger.getLogger(FakeBaseSteps.class);

    @Before
    public void beforeTest() {
        LOGGER.info("Initializing WebDriver>>>");
    }

    @After
    public void afterTest() {
        LOGGER.info("Killing WebDriver>>>");
        Driver.destroy();
    }
}
