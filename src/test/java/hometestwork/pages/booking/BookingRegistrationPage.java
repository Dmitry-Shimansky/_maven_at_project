package hometestwork.pages.booking;

import hometestwork.pages.trashmail.NewMail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingRegistrationPage {

    WebDriver driver = Driver.getWebDriver();

    public void registrationUser(String mail) {

        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'sign_in_wrapper']")));

        driver.findElement(By.xpath("//div[@class = 'sign_in_wrapper']")).click();

        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("login_name_register")));

        driver.findElement(By.id("login_name_register")).sendKeys(mail);
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }

    public void clickEnterButton() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")));
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }

    public void enterPassword(String password) {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("password")));
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmed_password")).sendKeys(password);
    }

    public void clickCreateAccountButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.id("wl252-modal-name")));
    }
}
