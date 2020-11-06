package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicityWait {
    public static void main(String[] args) {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(caps);

        driver.get("https://google.com");

        WebElement firstResult = new WebDriverWait(driver, 1000)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a")));
        firstResult.click();

        driver.close();
    }
}
