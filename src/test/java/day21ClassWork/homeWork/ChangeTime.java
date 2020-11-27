package day21ClassWork.homeWork;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ChangeTime {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "2bcbeeadb01c7ece");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.google.android.deskclock");
        cap.setCapability("appActivity", "com.android.deskclock.DeskClock");

        AndroidDriver<MobileElement> driver =
                new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

//       click menu button
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        click settings
        driver.findElement(By.xpath("//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        Automatic home clock switch OFF
        driver.findElement(By.xpath("//android.widget.FrameLayout[1]//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        click change date and time
        driver.findElement(By.xpath("//android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        Switch network provide time
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        click Time
        driver.findElement(By.xpath("//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        choose 9 hour
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='9']")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        choose 15 minutes
        driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//        click OK button
        driver.findElementById("android:id/button1").click();

        System.out.println(driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]").getText());
        String actualTime = driver.findElementByXPath("//android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]").getText();
        Assert.assertEquals("9:15 PM", actualTime);

        driver.quit();
    }
}
