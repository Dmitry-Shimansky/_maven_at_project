package hometestwork.tests;

import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import hometestwork.pages.booking.RegistrationPage_Booking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationTest_Booking {
    private RegistrationPage_Booking registrationUser = new RegistrationPage_Booking();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://booking.com/");
    }

    @Test
    public void registration (String mail) {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'sign_in_wrapper']")));

        registrationUser.registrationUser(mail);
        registrationUser.clickEnterButton();
        registrationUser.enterPassword("Asdfghjkl5");
        registrationUser.clickCreateAccountButton();
        new WebDriverWait(Driver.getWebDriver(), 5000)
                .until(ExpectedConditions.elementToBeClickable(By.id("wl252-modal-name")));
        WebElement textInclude = Driver.getWebDriver().findElement(By.id("wl252-modal-name"));

        Assert.assertEquals("wl252-modal-name",textInclude.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
