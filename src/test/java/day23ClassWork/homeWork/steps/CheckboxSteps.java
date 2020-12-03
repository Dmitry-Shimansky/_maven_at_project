package day23ClassWork.homeWork.steps;

import day23ClassWork.homeWork.pages.CheckboxPage;
import day23ClassWork.homeWork.pages.TextBoxPage;
import day23ClassWork.homeWork.tests.TextBoxTest;
import hometestwork.driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxSteps {
    private static final Logger LOGGER =Logger.getLogger(CheckboxSteps.class);
    CheckboxPage checkbox = new CheckboxPage();

    @Given("I go to checkbox")
    public void goToUrlStep() {
        Driver.getWebDriver().get("https://demoqa.com/checkbox");
    }

    @When("I start checking check box")
    public void iCheckBoxStep() {
        checkbox.chooseFirstCheckBox();
        checkbox.chooseSecondCheckBox();
    }

    @Then("I check is element chosen")
    public void isElementChosenStep() {
        WebElement firstBox = Driver.getWebDriver().findElement(By.xpath("//div[@id = 'result']//span[2]"));
        WebElement secondBox = Driver.getWebDriver().findElement(By.xpath("//div[@id = 'result']//span[3]"));
        Assert.assertEquals("notes",firstBox.getText());
        Assert.assertEquals("wordFile",secondBox.getText());
    }
}
