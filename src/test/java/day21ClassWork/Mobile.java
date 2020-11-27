package day21ClassWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Mobile {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "My");
        cap.setCapability("platformName", "android");
        cap.setCapability("browserName", "chrome");

        WebDriver driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);

        driver.get("https://tut.by");
        driver.close();
    }
}
