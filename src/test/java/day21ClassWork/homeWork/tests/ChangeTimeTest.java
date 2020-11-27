package day21ClassWork.homeWork.tests;

import day21ClassWork.homeWork.driverAndroid.DriverAndroid;
import day21ClassWork.homeWork.object.ChangeTimeObject;
import day21ClassWork.homeWork.settings.ClockCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangeTimeTest {
    private ChangeTimeObject changer = new ChangeTimeObject();

    @Test
    public void time() {
        changer.clickActions();

        Assert.assertEquals("9:15 PM",changer.getTime());
    }

    @After
    public void doAfter() {
        DriverAndroid.destroy();
    }
}
