package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.booking.BookingLoginPage;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.Before;
import org.junit.Test;

public class BookingFindMadridTest {
    private BookingLoginPage loginPage = new BookingLoginPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.BOOKING);
    }

    @Test
    public void loginTest() {

        loginPage.clickLoginButton();
        loginPage.enterLogin(ConfigForLogin.USER_BOOKING_LOGIN);
        loginPage.clickNextButton();
        loginPage.enterPass(ConfigForLogin.USER_BOOKING_PASSWORD);
        loginPage.clickSignInButton();

    }

//    @After
//    public void doAfter() {
//        Driver.destroy();
//    }


}
