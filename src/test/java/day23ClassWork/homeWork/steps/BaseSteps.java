package day23ClassWork.homeWork.steps;

import hometestwork.driver.Driver;
import io.cucumber.java.After;
import org.junit.Before;

public class BaseSteps {

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
