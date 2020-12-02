package day23ClassWork.homeWork.pages;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebtablesPage {
    WebDriver driver = Driver.getWebDriver();

    public void webEdite() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("edit-record-1")));
        driver.findElement(By.id("edit-record-1")).click();
        new WebDriverWait(Driver.getWebDriver(), 5)
                .until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Lukashok");
    }

    public void clickSubmit() {
        driver.findElement(By.id("submit")).click();
    }
}
