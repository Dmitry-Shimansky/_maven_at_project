package day23ClassWork.homeWork.tests;

import day23ClassWork.homeWork.pages.CheckboxPage;
import hometestwork.driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxTest {
    CheckboxPage checkbox = new CheckboxPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://demoqa.com/checkbox");
    }

    @Test
    public void checkboxTest() {
        checkbox.chooseFirstCheckBox();
        checkbox.chooseSecondCheckBox();

        WebElement firstBox = Driver.getWebDriver().findElement(By.xpath("//div[@id = 'result']//span[2]"));
        WebElement secondBox = Driver.getWebDriver().findElement(By.xpath("//div[@id = 'result']//span[3]"));

//        System.out.println(firstBox.getText());
        Assert.assertEquals("notes",firstBox.getText());
        Assert.assertEquals("wordFile",secondBox.getText());
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
