package resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.driver.Driver;
import resources.utils.NewMail;

public class VoidPORegistratePage {

    WebDriver driver = Driver.getWebDriver();

    public void registrateUser() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class = 'sign_in_wrapper']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("login_name_register")).sendKeys(new NewMail().name + "@trashmail.com");
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
        Thread.sleep(5000);
    }

    public void clickEnterButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirmed_password")).sendKeys(password);
    }

    public void clickCreateAccountButton() {
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--large bui-button--wide']")).click();
    }
}
