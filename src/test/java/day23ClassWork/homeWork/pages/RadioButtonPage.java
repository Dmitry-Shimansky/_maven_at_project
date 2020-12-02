package day23ClassWork.homeWork.pages;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RadioButtonPage {
    WebDriver driver = Driver.getWebDriver();

    public void chooseRadioButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id = 'impressiveRadio']")).click();
    }
}
