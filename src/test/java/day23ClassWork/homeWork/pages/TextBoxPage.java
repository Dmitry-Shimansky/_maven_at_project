package day23ClassWork.homeWork.pages;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TextBoxPage {
    WebDriver driver = Driver.getWebDriver();

    public void fillFields() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("userName-wrapper")));
        driver.findElement(By.xpath("//input[@autocomplete = 'off']")).sendKeys("Dimitrius Shimanius");
        driver.findElement(By.xpath("//div[@id = 'userEmail-wrapper']//input[@autocomplete = 'off']")).sendKeys("TastyHead@lovely.my");
        driver.findElement(By.tagName("textarea")).sendKeys("Luka avenue 666");
        driver.findElement(By.xpath("//div[@id = 'permanentAddress-wrapper']//textarea")).sendKeys("Mustaсhe district");
    }

    public void clickSubmitButton() {
        driver.findElement(By.id("submit")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
