package resources.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        return new ChromeDriver(caps);
    }

}
