package hometestwork.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import hometestwork.driver.Driver;

public class LoginPage {
    WebDriver driver = Driver.getWebDriver();

    public void enterLoginAndPass(String login, String password) {

        driver.findElement(By.id("login")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickEnterButton() {
        //driver.findElement(By.xpath()).click();
    }
}
