package hometestwork.pages.trashmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewMail {

    @Before
    public void doBefore() {
        Driver.getWebDriver().get("https://trashmail.com/");
    }

    public String name = "temp_" + System.currentTimeMillis();

    @Test
    public void createNewMail() {

        WebDriver driver = Driver.getWebDriver();

        driver.findElement(By.id("fe-mob-name")).clear();
        driver.findElement(By.id("fe-mob-name")).sendKeys(name);
//        WebElement firstResult = new WebDriverWait(driver, 5000)
//                .until(ExpectedConditions.elementToBeClickable(By.id("fe-mob-forward")));
//        firstResult.sendKeys("Shimansky.Dmitry@gmail.com");
        driver.findElement(By.id("fe-mob-forward")).sendKeys("Shimansky.Dmitry@gmail.com");
        driver.findElement(By.id("fe-mob-submit")).click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
