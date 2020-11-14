package hometestwork.pages.google;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmAccountPage {
    WebDriver driver = Driver.getWebDriver();

    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@ga-event-action = 'sign in']"))).click();
    }

    public void enterMail() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));

        driver.findElement(By.id("identifierId")).sendKeys("Shimansky.Dmitry@gmail.com");
    }

    public void clickNextButton() {
        driver.findElement(By.id("identifierNext")).click();
    }

    public void enterPassword() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));

        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("80172091353");
    }

    public void clickNextPasswordButton() {
        driver.findElement(By.id("passwordNext")).click();
    }

    public void clickNotWrightNow() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role = 'button']//span[@jsslot]")));

        driver.findElement(By.xpath("//div[@role = 'button']//span[@jsslot]")).click();
    }

    public void enterToEmail() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@class = 'zA yO'][1]")));

        driver.findElement(By.xpath("//tr[@class = 'zA yO'][1]")).click();
    }

    public void clickConfirmButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Confirm')]")));

        driver.findElement(By.xpath("//a[contains(text(), 'Confirm')]")).click();
    }
}
