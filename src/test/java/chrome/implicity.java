package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class implicity {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(caps);

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("погода в минске");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(., 'сейчас')]")).click();

        driver.close();
    }
}
