package hometestwork.pages.booking;

import hometestwork.driver.Driver;
import hometestwork.utils.GetCurrentDate;
import hometestwork.utils.GetNextDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingFindMadridPage {
    WebDriver driver = Driver.getWebDriver();
    private final String CHECKINFIELD = "//span[@class = 'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']";
    private final String CURRENTDATE = "//td[@data-date = '" + GetCurrentDate.currentDate() + "']";
    private final String NEXTDATE = "//td[@data-date = '" + GetNextDate.nextDate(1) +"']";
    private final String PLUSADULTBUTTON = "//button[@class = 'bui-button bui-button--secondary bui-stepper__add-button ']";
    private final String SEARCHBUTTON = "//button[@data-sb-id = 'main']";

    public void findMadrid() {
        driver.findElement(By.xpath("//input[@id = 'ss']")).sendKeys("madrid");
        driver.findElement(By.xpath(CHECKINFIELD)).click();
        driver.findElement(By.xpath(CURRENTDATE)).click();
        driver.findElement(By.xpath(NEXTDATE)).click();
        driver.findElement(By.xpath("//span[@class = 'xp__guests__count']")).click();

        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(PLUSADULTBUTTON))).click();
//        driver.findElement(By.xpath(PLUSADULTBUTTON)).click();

        driver.findElement(By.xpath(SEARCHBUTTON)).click();
    }
}
