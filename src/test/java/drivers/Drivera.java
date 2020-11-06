package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivera {

    private static WebDriver webDriver;

    public Drivera() {
    }

    public static WebDriver getWebDriver() {

        if (webDriver == null){
            ChromeOptions caps = new ChromeOptions();
            caps.addArguments("--ignore-certificate-errors");
            WebDriver webDriver = new ChromeDriver(caps);
        }
        return webDriver;
    }

}
