package day19_class_work.steps;

import drivers.Config;
import drivers.Driver;
import org.junit.After;
import org.junit.Before;

public class FakeBaseSteps {

    @Before
    public void doBefor() {
        System.out.println("Init Web Driver");
        Driver.setConfig(Config.CHROME);
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
