package day21ClassWork.homeWork;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class BoardKings {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "2bcbeeadb01c7ece");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.jellybtn.boardkings");
        cap.setCapability("appActivity", ".BKAppboyUnityPlayerActivity");

        AndroidDriver<MobileElement> driver =
                new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);

        driver.quit();
    }
}
