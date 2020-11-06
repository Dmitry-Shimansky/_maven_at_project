package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class google {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(caps);
        driver.get("https://googl.com");
        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("погода в минске");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text() = 'погода в минске']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[@class = 'LC20lb DKV0Md']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title = 'Погода в Минске на завтра']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//span[@class = 'unit unit_temperature_c'][text() = '+11']")));
        driver.close();
    }
}

