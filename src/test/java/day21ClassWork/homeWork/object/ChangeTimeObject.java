package day21ClassWork.homeWork.object;

import day21ClassWork.homeWork.driverAndroid.DriverAndroid;
import day21ClassWork.homeWork.settings.ClockCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ChangeTimeObject {
    AndroidDriver<MobileElement> driver = DriverAndroid.getAndroidDriver(ClockCapabilities.capabilities());

    private final String MENU_BUTTON = "//android.widget.ImageView[@content-desc='More options']";
    private final String SETTINGS_BUTTON = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView";
    private final String AUTOMATIC_HOME_TRIGGER = "//android.widget.FrameLayout[1]//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch";
    private final String DATA_AND_TIME = "//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView";
    private final String NETWOR_PROWIDE_TIME_TRIGGER = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch";
    private final String TIME = "//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]";
    private final String CHOOSE_9_HOUR = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='9']";
    private final String CHOOSE_15_MINUTES = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']";
    private final String OK_BUTTON = "android:id/button1";
//    public static String actualTime;

    public void clickActions() {

        driver.findElement(By.xpath(MENU_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath(SETTINGS_BUTTON)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath(AUTOMATIC_HOME_TRIGGER)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath(DATA_AND_TIME)).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.xpath(NETWOR_PROWIDE_TIME_TRIGGER)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath(TIME)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath(CHOOSE_9_HOUR)).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.findElement(By.xpath(CHOOSE_15_MINUTES)).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElementById(OK_BUTTON).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        System.out.println(driver.findElementByXPath(TIME).getText());
    }

    public String getTime() {
//        actualTime =
                return driver.findElementByXPath(TIME).getText();
    }
}
