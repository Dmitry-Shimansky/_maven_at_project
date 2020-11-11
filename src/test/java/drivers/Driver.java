package drivers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class Driver {

    private static WebDriver webDriver;
    private static Config config;

    private Driver() {
    }

    public static void setConfig(Config config) {
        Driver.config = config;
    }

    public static WebDriver getWebDriver() {
        if (webDriver == null) {
            try {
                webDriver = DriverManager.getDriver(config);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        Driver.webDriver = webDriver;
    }

    public static void destroy() {
        webDriver.quit();
        Driver.webDriver = null;
    }
}
