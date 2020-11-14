package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.booking.BookingRegistrationPage;
import hometestwork.pages.google.ConfirmAccountPage;
import hometestwork.pages.trashmail.TrashMailCreateNewMailPage;
import hometestwork.pages.trashmail.TrashMailLoginPage;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingRegistrationAndConfirmNewUserTest {
    private TrashMailCreateNewMailPage newMail = new TrashMailCreateNewMailPage();
    private TrashMailLoginPage loginTrashMail = new TrashMailLoginPage();
    private BookingRegistrationPage bookingRegistration = new BookingRegistrationPage();
    private ConfirmAccountPage confirmAccount = new ConfirmAccountPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.TRASHMAIL);
    }

    @Test
    public void newMailTest() {
        loginTrashMail.enterLoginAndPass(ConfigForLogin.USER_TRASH_LOGIN,ConfigForLogin.USER_TRASH_LOGIN);
        loginTrashMail.clickLoginButton();

        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("fe-grid_header-title-textEl")));

        newMail.addNewMail();
        Driver.getWebDriver().get(ConfigURLs.BOOKING);

        bookingRegistration.registration(newMail.mail);
        Driver.getWebDriver().get(ConfigURLs.GOOGLE);
        confirmAccount.clickSignInButton();
        confirmAccount.enterMail();
        confirmAccount.clickNextButton();
        confirmAccount.enterPassword();
        confirmAccount.clickNextPasswordButton();
        confirmAccount.clickNotWrightNow();
        confirmAccount.enterMail();
        confirmAccount.clickConfirmButton();

        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(), 'Email confirmed')]")));

        WebElement element = Driver.getWebDriver().findElement(By.xpath("//h1[contains(text(), 'Email confirmed')]"));

        Assert.assertEquals("Email confirmed",element.getAttribute("value"));

    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
