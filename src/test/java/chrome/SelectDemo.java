package chrome;

import drivers.Driver;
import drivers.Drivera;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
    @Test
    public void demo() throws InterruptedException {
        WebDriver driver = Driver.getWebDriver();

        driver.get("https://demoqa.com/select-menu");

        WebElement element = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element);
//        select.selectByValue("White");
        select.selectByVisibleText("White");
//        select.deselectAll();
//        select.getOptions();
        Thread.sleep(5000);
        driver.close();
    }
}
