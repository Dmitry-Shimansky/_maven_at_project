package day23ClassWork.homeWork.pages;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsCheckingPage {
    WebDriver driver = Driver.getWebDriver();

    public void clickDoubleButton() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("doubleClickBtn")));
        driver.findElement(By.id("doubleClickBtn")).click();
    }

    public void clickRightButton() {
        driver.findElement(By.id("rightClickBtn")).click();
    }

    public void clickClickMeButton() {
        driver.findElement(By.xpath("//button[text() = 'Click Me']")).click();
    }
}
