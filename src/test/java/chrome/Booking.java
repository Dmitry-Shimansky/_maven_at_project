package chrome;

import drivers.Driver;
import drivers.Drivera;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Booking {
    @Test
    public void book() throws InterruptedException, ParseException {
        WebDriver driver = Driver.getWebDriver();

        driver.get("https://booking.com");

        driver.findElement(By.xpath("//input[@id = 'ss']")).sendKeys("париж");
        driver.findElement(By.xpath("//span[@class = 'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']")).click();
        driver.findElement(By.xpath("//td[@data-date = '2020-11-03']")).click();
        driver.findElement(By.xpath("//td[@data-date = '2020-11-10']")).click();
        driver.findElement(By.xpath("//span[@class = 'xp__guests__count']")).click();
//        new WebDriverWait(driver, 1000)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'bui-button bui-button--secondary bui-stepper__add-button ']"))).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--secondary bui-stepper__add-button ']")).click();
        driver.findElement(By.xpath("//button[@class = 'bui-button bui-button--secondary bui-stepper__add-button ']")).click();
        driver.findElement(By.xpath("//button[@aria-label = 'Increase number of Rooms']")).click();
        driver.findElement(By.xpath("//button[@data-sb-id = 'main']")).click();
//        new WebDriverWait(driver, 1000)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id = 'pri-5']"))).click();
        //driver.findElement(By.xpath("//span[contains(text(), '1 200 +')]")).click();
        //driver.findElement(By.xpath("//a[contains(text(), 'Цена (сначала самая низкая)')]")).click();
//        new WebDriverWait(driver, 1000)
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("a//[@class='sort_option ' and @data-category='price']"))).click();
        //a[@class = '_5235a97dfa ' and @data-type = 'price'] or
        WebElement firstPrice = driver.findElement(By.xpath("//a[@data-id = 'pri-5']"));
        //firstPrice.getText();
        WebElement secondPrice = driver.findElement(By.xpath("//div[@data-et-view and @data-et-click][1]"));
        //secondPrice.getText();

        //System.out.println(Integer.parseInt(firstPrice.getText()));
        System.out.println(NumberFormat.getNumberInstance(Locale.FRANCE).parse(firstPrice.getText()));
        System.out.println(secondPrice.getText());

        driver.close();
    }
}
