package day21ClassWork.homeWork.driverAndroid;

import hometestwork.driver.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverAndroid {

    private static AndroidDriver<MobileElement> androidDriver;

    private DriverAndroid() {
    }

    public static AndroidDriver<MobileElement> getAndroidDriver(DesiredCapabilities cap) {
        if (androidDriver == null) {
            try {
                androidDriver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return androidDriver;
    }

    public static void destroy() {
        androidDriver.quit();
        DriverAndroid.androidDriver = null;
    }
}
