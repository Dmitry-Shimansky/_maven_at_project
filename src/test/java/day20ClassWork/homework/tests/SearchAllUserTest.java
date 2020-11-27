package day20ClassWork.homework.tests;

import day20ClassWork.Search;
import day20ClassWork.homework.utils.Assured;
import io.restassured.RestAssured;
import org.junit.Test;

public class SearchAllUserTest {
    @Test
    public void searchAllUser() {

        String a = RestAssured
                .given()
                .spec(Assured.REQUEST_SPECIFICATION)
                .body(new Search("", true))
                .when()
                .post()
                .then()
                .extract().body().asString();
        System.out.println(a);
    }
}
