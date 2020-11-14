package hometestwork.tests;

import hometestwork.driver.Driver;
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

public class TrashMailLoginTest {
    private TrashMailLoginPage trashMail = new TrashMailLoginPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.TRASHMAIL);
    }

    @Test
    public void loginTest() {
        trashMail.enterLoginAndPass(ConfigForLogin.USER_TRASH_LOGIN,ConfigForLogin.USER_TRASH_LOGIN);
        trashMail.clickLoginButton();

        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("fe-grid_header-title-textEl")));

        WebElement loginValue = Driver.getWebDriver().findElement(By.id("fe-grid_header-title-textEl"));

        Assert.assertEquals("fe-grid_header-title-textEl",loginValue.getAttribute("id"));
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
