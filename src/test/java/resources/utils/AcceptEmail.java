package resources.utils;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.driver.Driver;

public class AcceptEmail {

    @Test
    public void acceptMail() throws InterruptedException {

        WebDriver driver = Driver.getWebDriver();

        driver.get("https://mail.google.com//");

        driver.findElement(By.xpath("//div[@id = ':nen']//span[text() = 'TrashMail Robot']")).click();
//        new WebDriverWait(driver, 1000)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = contains(text(), 'https://trashmail.com/?lang') and @rel = 'noreferrer']"))).click();
        driver.findElement(By.xpath("//a[@href = contains(text(), 'https://trashmail.com/?lang') and @rel = 'noreferrer']")).click();
        Thread.sleep(5000);

        driver.close();
    }
}
