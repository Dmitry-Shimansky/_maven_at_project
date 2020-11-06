package chrome;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DemoConsole {
    public static void main(String[] args) throws IOException {

        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("--ignore-certificate-errors");
        WebDriver driver = new ChromeDriver(caps);
        driver.get("https://tut.by");

        new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));

        Files.copy(new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)),
                Paths.get("/Users/DmitryShimansky/Desktop/ScreenShot"), StandardCopyOption.REPLACE_EXISTING);

        driver.close();
    }
}
