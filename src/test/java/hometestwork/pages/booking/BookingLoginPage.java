package hometestwork.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingLoginPage {
    WebDriver driver = Driver.getWebDriver();

    public void clickLoginButton() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sign in')]")));
        driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
    }

    public void enterLogin(String login) {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("username")));
        driver.findElement(By.id("username")).sendKeys(login);
    }

    public void clickContinueButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }

    public void enterPass(String password) {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("password")));
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickSignInButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("ss")));
    }
}
