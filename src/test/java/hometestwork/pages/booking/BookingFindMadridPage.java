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
    private final String MYNEXTTRIPBUTTON = "//div[@id = 'hotel-wishlists'][2]//div[@class = 'wl-dropdown-saved-to-message']/a";
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

    public void firstHotelName() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(FIRSTHOTELNAME)));
        WebElement firstHotelNameSearchList = Driver.getWebDriver().findElements(By.xpath(FIRSTHOTELNAME)).get(0);
        System.out.println(firstHotelNameSearchList.getText());
        firstHotelNameSearchlist = firstHotelNameSearchList.getText();
    }

    public void secondHotelName() {
        WebElement secondHotelNameSearchList = Driver.getWebDriver().findElements(By.xpath(SECONDHOTELNAME)).get(0);
        System.out.println(secondHotelNameSearchList.getText());
        secondHotelNameSearchlist = secondHotelNameSearchList.getText();
    }

    public void clickMyNextTrip() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath(MYNEXTTRIPBUTTON)));
        driver.findElement(By.xpath(MYNEXTTRIPBUTTON)).click();
    }

    public void firstHotelNameFavouriteList() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+ firstHotelNameSearchlist +"')]")));
        WebElement firstHotel = Driver.getWebDriver().findElement(By.xpath("//a[contains(text(),'"+ firstHotelNameSearchlist +"')]"));
        System.out.println(firstHotel);
        firstHotelNameFavouriteList = firstHotel.getAttribute("value");
    }

    public void secondHotelNameFavouriteList() {
        new WebDriverWait(Driver.getWebDriver(), 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'"+ secondHotelNameSearchlist +"')]")));
        WebElement secondHotel = Driver.getWebDriver().findElement(By.xpath("//a[contains(text(),'"+ secondHotelNameSearchlist +"')]"));
        System.out.println(secondHotel);
        secondHotelNameFavouriteList = secondHotel.getAttribute("value");
    }
}
