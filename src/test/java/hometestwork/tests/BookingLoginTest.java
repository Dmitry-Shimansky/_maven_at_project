package hometestwork.tests;

import hometestwork.driver.Driver;
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
        Driver.getWebDriver().get("https://booking.com/");
    }

    @Test
    public void loginTest() {

        loginPage.clickLoginButton();

        loginPage.enterLogin("asd@mail.by");
        loginPage.clickNextButton();

        loginPage.enterPass("Qwertyuiop1");
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
