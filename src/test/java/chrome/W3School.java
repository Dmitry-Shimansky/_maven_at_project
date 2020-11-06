package chrome;

import drivers.Driver;
import drivers.Drivera;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class W3School {

    @Test
    public void W3S() throws InterruptedException {
        WebDriver driver = Driver.getWebDriver();

        driver.get("https://www.w3schools.com/java/");

        //driver.findElement(By.xpath("//span[@class = 'color_h1']"));
        Actions make = new Actions(driver);
        make.doubleClick(driver.findElement(By.xpath("//span[@class = 'color_h1']")));

        make
                .keyDown(Keys.COMMAND)
                .sendKeys("с")
                .keyUp(Keys.COMMAND)
                .build()
                .perform();

        driver.get("https://google.com");
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("//input[@name = 'q']"));

        make
                .click(element)
                .keyDown(Keys.COMMAND)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        Thread.sleep(2000);

        int resultAmount = driver.findElements(By.xpath("//div[@class = 'g' and contains(., 'tutorial')]")).size();

        Assert.assertEquals(11,resultAmount);

        driver.close();
    }
}
