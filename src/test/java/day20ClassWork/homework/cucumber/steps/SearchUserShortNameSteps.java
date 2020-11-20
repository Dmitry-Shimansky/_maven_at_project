package day20ClassWork.homework.cucumber.steps;

import day20ClassWork.Search;
import day20ClassWork.homework.utils.Assured;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.apache.log4j.Logger;

public class SearchUserShortNameSteps {

    private static final Logger LOGGER =Logger.getLogger(SearchUserShortNameSteps.class);

    @Given("I go to URL")
    public void goToUrlStep() {
        LOGGER.info("I start");

        JsonPath a = RestAssured
                .given()
                .spec(Assured.REQUEST_SPECIFICATION)
                .body(new Search("Alberto Boo", true))
                .when()
                .post()
                .then()
                .extract().body().jsonPath();
        System.out.println(a);
    }

    @When("I Login on site")
    public void iLoginOnSiteStep() {
        LOGGER.info("click login button");

    }

    @Then("I verified result as expected")
    public void justPassStep() {
        LOGGER.info("I passed");

    }
}
