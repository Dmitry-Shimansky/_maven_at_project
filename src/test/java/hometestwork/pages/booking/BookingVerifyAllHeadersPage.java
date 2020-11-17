package hometestwork.pages.booking;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingVerifyAllHeadersPage {
    WebDriver driver = Driver.getWebDriver();

    public int findAllHeaders() {
//        new WebDriverWait(Driver.getWebDriver(), 30).until(
//                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int headers = driver.findElements(By.xpath("//head")).size();
        return headers;
    }
}
