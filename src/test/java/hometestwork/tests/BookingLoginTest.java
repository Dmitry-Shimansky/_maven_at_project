package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hometestwork.pages.booking.BookingLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingLoginTest {
    private BookingLoginPage loginPage = new BookingLoginPage();

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

        WebElement logoText = Driver.getWebDriver().findElement(By.id("wl252-modal-name"));

//        Проверка
        Assert.assertEquals("wl252-modal-name", logoText.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
