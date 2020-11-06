package drivers;

import org.openqa.selenium.WebDriver;

public class ThreadLocalDriver {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getWebDriver() {
        if(webDriver.get() == null) {
            webDriver.set(drivers.DriverManager.getDriver(drivers.Config.CHROME));
        }
        return webDriver.get();
    }

    public static void setThreadLocalWebDriver() {
        webDriver.set(null);
    }
}
