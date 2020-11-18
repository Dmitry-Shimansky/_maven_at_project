package hometestwork.cucumber.steps;

import hometestwork.driver.Driver;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;

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
