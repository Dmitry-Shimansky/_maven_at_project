package hometestwork.pages.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingLoginPage {
    WebDriver driver = Driver.getWebDriver();

    public void clickLoginButton() {
        driver.findElement(By.id("current_account")).click();
    }

    public void enterLogin(String login) {
        new WebDriverWait(Driver.getWebDriver(), 5000)
                .until(ExpectedConditions.elementToBeClickable(By.id("username")));
        driver.findElement(By.id("username")).sendKeys(login);
    }

    public void clickNextButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }

    public void enterPass(String password) {
        new WebDriverWait(Driver.getWebDriver(), 5000)
                .until(ExpectedConditions.elementToBeClickable(By.id("password")));
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickSignInButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }
}
