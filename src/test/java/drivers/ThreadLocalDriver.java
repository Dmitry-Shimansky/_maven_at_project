package drivers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class ThreadLocalDriver {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver() throws MalformedURLException {
        if(webDriver.get() == null) {
            webDriver.set(drivers.DriverManager.getDriver(drivers.Config.CHROME));
        }
        return webDriver.get();
    }

    public static void setThreadLocalWebDriver() {
        webDriver.set(null);
    }
}
