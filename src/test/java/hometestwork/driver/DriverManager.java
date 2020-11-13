package hometestwork.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private DriverManager() {
    }

    public static WebDriver getDriver(Config config) {

        switch (config != null ? config : Config.CHROME) {
            case SAFARY:
                return getSafariDriver();
            case IE:
                return getIEDriver();
            case OPERA:
                return getOperaDriver();
            case REMOTE:
                try {
                    return getRemoteDriver();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            default:
                return getChromeDriver();
        }
    }

    private static WebDriver getSafariDriver() {
        // TODO
        return null;
    }

    private static WebDriver getOperaDriver() {
        // TODO
        return null;
    }

    private static WebDriver getIEDriver() {
        // TODO
        return null;
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");
        caps.addArguments("--ignore-certificate-errors");
//        return new ChromeDriver(caps);
        WebDriver driver = new ChromeDriver(caps);
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver getRemoteDriver() throws MalformedURLException {
        ChromeOptions option = new ChromeOptions();
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), option);

        return driver;
    }
}
