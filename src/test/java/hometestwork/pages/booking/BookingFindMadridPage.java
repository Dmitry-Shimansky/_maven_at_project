package hometestwork.pages.booking;

import hometestwork.driver.Driver;
import hometestwork.utils.GetNewDate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingFindMadridPage {
    WebDriver driver = Driver.getWebDriver();
    private final String CHECKINFIELD = "//span[@class = 'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']";
    private final String PLUSMONTHTDATE = "//td[@data-date = '" + GetNewDate.nextDate(1, 0) + "']";
    private final String PLUSMONTHAND5DAY = "//td[@data-date = '" + GetNewDate.nextDate(1, 5) + "']";
//    private final String PLUSADULTBUTTON = "//button[@class = 'bui-button bui-button--secondary bui-stepper__add-button ']";
    private final String SEARCHBUTTON = "//button[@data-sb-id = 'main']";
    private final String FIRSTHOTEL = "//div[@data-et-click]//button[@data-hotel-id]";
    private final String LASTHOTEL = "//div[@id = 'hotellist_inner']/div[@data-et-view][last()]//button";
    private final String FIRSTHOTELNAME = "//div[@data-et-click]//span[@data-et-click]";
    private final String SECONDHOTELNAME = "//div[@id = 'hotellist_inner']/div[@data-et-view][last()]//span[@data-et-click]";
    public String firstHotelNameSearchlist;
    public String secondHotelNameSearchlist;
    public String firstHotelNameFavouriteList;
    public String secondHotelNameFavouriteList;


    public void findMadrid() {
        driver.findElement(By.xpath("//input[@id = 'ss']")).clear();
        driver.findElement(By.xpath("//input[@id = 'ss']")).sendKeys("Madrid");
        driver.findElement(By.xpath(CHECKINFIELD)).click();
        driver.findElement(By.xpath(PLUSMONTHTDATE)).click();
        driver.findElement(By.xpath(PLUSMONTHAND5DAY)).click();

//        driver.findElement(By.xpath("//span[@class = 'xp__guests__count']")).click();
//        new WebDriverWait(Driver.getWebDriver(), 10)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath(PLUSADULTBUTTON))).click();
//        driver.findElement(By.xpath(PLUSADULTBUTTON)).click();

        driver.findElement(By.xpath(SEARCHBUTTON)).click();

        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-et-click]//button[@data-hotel-id]")));
    }

    public void clickToFavouriteFirstAndLast() {
        driver.findElement(By.xpath(FIRSTHOTEL)).click();
        driver.findElement(By.xpath(LASTHOTEL)).click();
    }

    public String firstHotelName() {
        WebElement firstHotelNameSearchList = Driver.getWebDriver().findElement(By.xpath(FIRSTHOTELNAME));
        return firstHotelNameSearchlist = firstHotelNameSearchList.getAttribute("value");
    }

    public String secondHotelName() {
        WebElement secondHotelNameSearchList = Driver.getWebDriver().findElement(By.xpath(SECONDHOTELNAME));
        return secondHotelNameSearchlist = secondHotelNameSearchList.getAttribute("value");
    }

    public void clickMyNextTrip() {
        driver.findElement(By.xpath("//div[@class = 'wl-dropdown-saved-to-message']")).click();
        new WebDriverWait(Driver.getWebDriver(), 20)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-et-click]//span[@data-et-click]")));
    }

    public String firstHotelNameFavouriteList() {
        WebElement firstHotel = Driver.getWebDriver().findElement(By.xpath("//a[contains(text(),'"+ firstHotelNameSearchlist +"')]"));
        return firstHotelNameFavouriteList = firstHotel.getAttribute("value");
    }

    public String secondHotelNameFavouriteList() {
        WebElement secondHotel = Driver.getWebDriver().findElement(By.xpath("//a[contains(text(),'"+ secondHotelNameSearchlist +"')]"));
        return secondHotelNameFavouriteList = secondHotel.getAttribute("value");
    }
}
