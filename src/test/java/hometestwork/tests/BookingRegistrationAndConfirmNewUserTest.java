package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.booking.BookingRegistrationPage;
import hometestwork.pages.google.GoogleConfirmAccountPage;
import hometestwork.pages.mailru.MailRuConfirmAccountPage;
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

public class BookingRegistrationAndConfirmNewUserTest {
    private TrashMailCreateNewMailPage newMail = new TrashMailCreateNewMailPage();
    private TrashMailLoginPage loginTrashMail = new TrashMailLoginPage();
    private BookingRegistrationPage bookingRegistration = new BookingRegistrationPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.TRASHMAIL);
    }

    @Test
    public void newMailTest() {
        loginTrashMail.enterLoginAndPass(ConfigForLogin.USER_TRASH_LOGIN,ConfigForLogin.USER_TRASH_PASSWORD);
        loginTrashMail.clickLoginButton();

        newMail.addNewMail();
        MailRuConfirmAccountPage confirmBookingAccount = new MailRuConfirmAccountPage(newMail);

        Driver.getWebDriver().get(ConfigURLs.BOOKING);

        bookingRegistration.registrationUser(newMail.mail);
        bookingRegistration.clickEnterButton();
        bookingRegistration.enterPassword(ConfigForLogin.USER_BOOKING_PASSWORD);
        bookingRegistration.clickCreateAccountButton();

        Driver.getWebDriver().get(ConfigURLs.MAILRU);

        confirmBookingAccount.enterEmailAndSubmit();
        confirmBookingAccount.enterPassAndSubmit();
        confirmBookingAccount.enterToEmail();
        confirmBookingAccount.clickConfirmButton();

        WebElement element = Driver.getWebDriver().findElement(By.id("ed01fcee-d690-46c3-9f0d-b43e1340231b"));

        Assert.assertEquals("Email confirmed",element.getAttribute("value"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
