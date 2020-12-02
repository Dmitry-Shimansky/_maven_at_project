package day23ClassWork.homeWork.tests;

import day23ClassWork.homeWork.pages.WebtablesPage;
import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebtablesTest {
    WebtablesPage webEdite = new WebtablesPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://demoqa.com/webtables");
    }

    @Test
    public void webEditeTest() {
        webEdite.webEdite();
        webEdite.clickSubmit();

        WebElement elem = Driver.getWebDriver().findElement(By.xpath("//div[text() = 'Lukashok']"));

        Assert.assertEquals("Lukashok",elem.getText());
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
