package day23ClassWork.homeWork.tests;

import day23ClassWork.homeWork.pages.ButtonsCheckingPage;
import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ButtonsCheckingTest {
    ButtonsCheckingPage buttonsChecking = new ButtonsCheckingPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://demoqa.com/buttons");
    }

    @Test
    public void checkButtons() {
        buttonsChecking.clickDoubleButton();
        buttonsChecking.clickRightButton();
        buttonsChecking.clickClickMeButton();

        WebElement elem = Driver.getWebDriver().findElement(By.id("dynamicClickMessage"));

        Assert.assertEquals("You have done a dynamic click",elem.getText());
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
