package hometestwork.pages.mailru;

import hometestwork.driver.Driver;
import hometestwork.pages.trashmail.TrashMailCreateNewMailPage;
import hometestwork.settings.ConfigForLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailRuConfirmAccountPage {
    WebDriver driver = Driver.getWebDriver();

    public MailRuConfirmAccountPage(TrashMailCreateNewMailPage newMail) {
        this.emailFromTrashMail = "//span[.//text() = '" + newMail.mail + "']";
    }

    private final String emailFromTrashMail;

    public void enterEmailAndSubmit() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailbox:login-input")));
        driver.findElement(By.id("mailbox:login-input")).sendKeys(ConfigForLogin.USER_MAILRU_LOGIN);
        driver.findElement(By.id("mailbox:submit-button")).click();
    }

    public void enterPassAndSubmit() {
        driver.findElement(By.id("mailbox:password-input")).sendKeys(ConfigForLogin.USER_MAILRU_PASSWORD);
        driver.findElement(By.id("mailbox:submit-button")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailFromTrashMail)));
    }

    public void enterToEmail() {
        driver.findElement(By.xpath(emailFromTrashMail)).click();
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'button_mr_css_attr']")));
    }

    public void clickConfirmButton() {
        driver.findElement(By.xpath("//a[@class = 'button_mr_css_attr']")).click();
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ed01fcee-d690-46c3-9f0d-b43e1340231b")));
        //"//h1[contains(text(), 'Email confirmed')]"
    }
}
