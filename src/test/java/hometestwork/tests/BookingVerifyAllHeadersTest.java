package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.booking.BookingLoginPage;
import hometestwork.pages.booking.BookingVerifyAllHeadersPage;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookingVerifyAllHeadersTest {
    private BookingLoginPage loginPage = new BookingLoginPage();
    private BookingVerifyAllHeadersPage headersTest = new BookingVerifyAllHeadersPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.BOOKING);
    }

    @Test
    public void loginTest() {

        loginPage.clickLoginButton();
        loginPage.enterLogin(ConfigForLogin.USER_BOOKING_LOGIN);
        loginPage.clickContinueButton();
        loginPage.enterPass(ConfigForLogin.USER_BOOKING_PASSWORD);
        loginPage.clickSignInButton();

        Assert.assertEquals(9,headersTest.findAllHeaders());
    }
}
