package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.google.GoogleConfirmAccountPage;
import hometestwork.settings.ConfigURLs;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleConfirmAccountTest {
    private GoogleConfirmAccountPage confirmAccount = new GoogleConfirmAccountPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.GOOGLE);
    }

    @Test
    public void loginGoogleTest() {

        confirmAccount.clickMailButton();
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
