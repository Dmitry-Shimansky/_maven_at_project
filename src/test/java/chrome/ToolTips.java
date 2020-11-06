package chrome;

import drivers.Drivera;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Drivera.getWebDriver();

        driver.get("https://booking.com");

        WebElement element = driver.findElement(By.xpath("button.bui-button.bui-button--light.bui-button--large[data-tooltip-text='Choose your currency']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        Thread.sleep(5000);

        WebElement toolTip = driver.findElement(By.id("//*[@*[contains(., 'Choose your currency')]]/.."));

        Assert.assertEquals("Choose your currency",toolTip.getText());

        driver.close();
    }
}
