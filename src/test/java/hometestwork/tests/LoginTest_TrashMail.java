package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.trashmail.LoginPage_TrashMail;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest_TrashMail {
    private LoginPage_TrashMail trashMail = new LoginPage_TrashMail();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://trashmail.com/");
    }

    @Test
    public void loginTest() {
        trashMail.enterLoginAndPass("Dmitry_Shimansky","2091353");
        trashMail.clickLoginButton();

        new WebDriverWait(Driver.getWebDriver(), 5000)
                .until(ExpectedConditions.elementToBeClickable(By.id("fe-grid_header-title-textEl")));

        WebElement loginValue = Driver.getWebDriver().findElement(By.id("fe-grid_header-title-textEl"));

        Assert.assertEquals("fe-grid_header-title-textEl",loginValue.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
