package hometestwork.pages.trashmail;

import hometestwork.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrashMailCreateNewMailPage {
    WebDriver driver = Driver.getWebDriver();
    public String mail;

    public String addNewMail() {
        driver.findElement(By.id("fe-add-btnWrap")).click();
        driver.findElement(By.id("fe-save-btnWrap")).click();
        driver.findElement(By.xpath("//tr[@class = '  x-grid-row']")).click();
        WebElement eMail = driver.findElement(By.id("fe-dea-address-inputEl"));

        System.out.println(eMail.getAttribute("value"));

        return mail = eMail.getAttribute("value");
    }

}
