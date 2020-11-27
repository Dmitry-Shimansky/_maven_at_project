package day21ClassWork.homeWork.settings;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ClockCapabilities {
    public static DesiredCapabilities capabilities() {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "2bcbeeadb01c7ece");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.google.android.deskclock");
        cap.setCapability("appActivity", "com.android.deskclock.DeskClock");

        return cap;
    }
}
