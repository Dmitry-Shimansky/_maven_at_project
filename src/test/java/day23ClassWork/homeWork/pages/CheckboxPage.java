package day23ClassWork.homeWork.pages;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxPage {
    WebDriver driver = Driver.getWebDriver();

    public void chooseFirstCheckBox() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label = 'Toggle']")));
        driver.findElement(By.xpath("//button[@aria-label = 'Toggle']")).click();
        driver.findElement(By.xpath("//ol//ol//button[@aria-label = 'Toggle']")).click();
        driver.findElement(By.xpath("//ol//ol//ol//span[2]")).click();
    }

    public void chooseSecondCheckBox() {
        driver.findElement(By.xpath("//ol//ol//li[3]//button")).click();
        driver.findElement(By.xpath("//ol//ol//li[3]//ol//span[@class = 'rct-checkbox']")).click();
    }
}
