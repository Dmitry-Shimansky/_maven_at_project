package hometestwork.pages.trashmail;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrashMailLoginPage {
    WebDriver driver = Driver.getWebDriver();

    public void enterLoginAndPass(String login,String password) {
        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).clear();
        driver.findElement(By.xpath("//input[@placeholder = 'Username']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).clear();
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();
    }
}
