package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.google.ConfirmAccount;
import hometestwork.pages.trashmail.CreateNewMail_TrashMail;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMail_RegistrationTest_Booking {
    private CreateNewMail_TrashMail newMail = new CreateNewMail_TrashMail();
    private LoginTest_TrashMail login = new LoginTest_TrashMail();
    private RegistrationTest_Booking bookingRegistration = new RegistrationTest_Booking();
    private ConfirmAccount confirmAccount = new ConfirmAccount();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://trashmail.com/");
    }

    @Test
    public void newMailTest() {
        login.loginTest();
        newMail.addNewMail();
        Driver.getWebDriver().get("https://booking.com/");
        bookingRegistration.registration(newMail.mail);
        Driver.getWebDriver().get("https://google.com/mail");
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
