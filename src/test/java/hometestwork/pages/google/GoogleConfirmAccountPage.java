package hometestwork.pages.google;

import hometestwork.driver.Driver;
import hometestwork.settings.ConfigForLogin;
import hometestwork.settings.ConfigURLs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleConfirmAccountPage {
    WebDriver driver = Driver.getWebDriver();
    private final String SIGN_IN_BUTTON = "//div[@class = 'hercules-header h-c-header h-c-header--product-marketing-one-tier header--desktop']//a[@ga-event-action = 'sign in']";

    public  void clickMailButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-pid = '23'][1]"))).click();
    }

    public void clickSignInButton() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SIGN_IN_BUTTON))).click();
    }

    public void enterMail() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));

        driver.findElement(By.id("identifierId")).sendKeys(ConfigForLogin.USER_GOOGLE_LOGIN);
    }

    public void clickNextButton() {
        driver.findElement(By.id("identifierNext")).click();
    }

    public void enterPassword() {
        WebDriverWait wait = new WebDriverWait(Driver.getWebDriver(), 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));

        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(ConfigForLogin.USER_GOOGLE_PASSWORD);
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
