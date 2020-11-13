package hometestwork.pages.trashmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;

public class AcceptEmail {

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://mail.google.com//");
    }

    @Test
    public void acceptMail() throws InterruptedException {

        WebDriver driver = Driver.getWebDriver();

        driver.findElement(By.xpath("//div[@id = ':nen']//span[text() = 'TrashMail Robot']")).click();
//        new WebDriverWait(driver, 1000)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = contains(text(), 'https://trashmail.com/?lang') and @rel = 'noreferrer']"))).click();
        driver.findElement(By.xpath("//a[@href = contains(text(), 'https://trashmail.com/?lang') and @rel = 'noreferrer']")).click();
        Thread.sleep(15000);
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
