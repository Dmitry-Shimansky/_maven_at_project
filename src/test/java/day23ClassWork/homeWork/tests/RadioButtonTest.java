package day23ClassWork.homeWork.tests;

import day23ClassWork.homeWork.pages.RadioButtonPage;
import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtonTest {
    RadioButtonPage radioButton = new RadioButtonPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://demoqa.com/radio-button");
    }

    @Test
    public void radioButtonTest() {
        radioButton.chooseRadioButton();

        WebElement radioButtonElem = Driver.getWebDriver().findElement(By.xpath("//span[@class = 'text-success']"));

        Assert.assertEquals("Impressive", radioButtonElem.getText());
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
