package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hometestwork.pages.booking.BookingRegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingRegistrationTest {
    private BookingRegistrationPage registrationUser = new BookingRegistrationPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.BOOKING);
    }

    @Test
    public void registration (String mail) {

        registrationUser.registrationUser(mail);
        registrationUser.clickEnterButton();
        registrationUser.enterPassword(ConfigForLogin.USER_BOOKING_PASSWORD);
        registrationUser.clickCreateAccountButton();

        WebElement textInclude = Driver.getWebDriver().findElement(By.id("wl252-modal-name"));

        Assert.assertEquals("wl252-modal-name",textInclude.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
