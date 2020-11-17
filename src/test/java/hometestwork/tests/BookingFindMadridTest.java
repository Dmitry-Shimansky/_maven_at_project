package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.booking.BookingFindMadridPage;
import hometestwork.pages.booking.BookingLoginPage;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookingFindMadridTest {
    private BookingLoginPage loginPage = new BookingLoginPage();
    private BookingFindMadridPage findHotels = new BookingFindMadridPage();

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

        findHotels.findMadrid();

        findHotels.firstHotelName();
        findHotels.secondHotelName();

        findHotels.clickToFavouriteFirstAndLast();

        findHotels.clickMyNextTrip();

        findHotels.firstHotelNameFavouriteList();
        findHotels.secondHotelNameFavouriteList();

        Assert.assertEquals(findHotels.firstHotelNameSearchlist,findHotels.firstHotelNameFavouriteList);
        Assert.assertEquals(findHotels.secondHotelNameSearchlist,findHotels.secondHotelNameFavouriteList);
    }

//    @After
//    public void doAfter() {
//        Driver.destroy();
//    }


}
