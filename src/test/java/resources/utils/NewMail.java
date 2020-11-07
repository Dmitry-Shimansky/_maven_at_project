package resources.utils;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.driver.Driver;

public class NewMail {

    public String name = "temp_" + System.currentTimeMillis();

    @Test
    public void createNewMail() {
        WebDriver driver = Driver.getWebDriver();

        driver.get("https://trashmail.com/");

        driver.findElement(By.id("fe-name")).sendKeys(name);
        driver.findElement(By.id("fe-forward")).sendKeys("Dmitry.Shimansky@gmail.com");
        driver.findElement(By.id("fe-submit")).click();

        driver.close();
    }
}
