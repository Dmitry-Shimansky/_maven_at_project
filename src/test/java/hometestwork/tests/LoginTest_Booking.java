package hometestwork.tests;

import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hometestwork.pages.booking.LoginPage_Booking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest_Booking {
    private LoginPage_Booking loginPage = new LoginPage_Booking();

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

//Ожидание загрузки элемента
        new WebDriverWait(Driver.getWebDriver(), 5000)
                .until(ExpectedConditions.elementToBeClickable(By.id("wl252-modal-name")));

        WebElement logoText = Driver.getWebDriver().findElement(By.id("wl252-modal-name"));

//        Проверка
        Assert.assertEquals("wl252-modal-name", logoText.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
