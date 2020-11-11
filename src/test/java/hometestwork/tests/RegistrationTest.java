package hometestwork.tests;

import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import hometestwork.pages.RegistrationPage;

public class RegistrationTest {
    private RegistrationPage registrationUser;

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://booking.com/");
//        Driver.getWebDriver().manage().window().maximize();
    }

    @Test
    public void registration () throws InterruptedException {
        Thread.sleep(20000);
        registrationUser.registrationUser();
        registrationUser.clickEnterButton();
        registrationUser.enterPassword("2091353");
        registrationUser.clickCreateAccountButton();
    }

//    @After
//    public void doAfter() {
//        Driver.destroy();
//    }
}
