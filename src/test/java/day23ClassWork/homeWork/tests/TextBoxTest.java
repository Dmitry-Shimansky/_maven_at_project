package day23ClassWork.homeWork.tests;

import day23ClassWork.homeWork.pages.TextBoxPage;
import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxTest {
    private TextBoxPage textBox = new TextBoxPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://demoqa.com/text-box");
    }

    @Test
    public void textBoxTest() {
        textBox.fillFields();
        textBox.clickSubmitButton();

        WebElement checkElem = Driver.getWebDriver().findElement(By.id("output"));

//        System.out.println(checkElem.isDisplayed());

        Assert.assertTrue(checkElem.isDisplayed());
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
