package day20ClassWork.homework.tests;

import day20ClassWork.Search;
import day20ClassWork.homework.utils.Assured;
import io.restassured.RestAssured;
import org.junit.Test;

public class SearchUserShortNameTest {
    @Test
    public void searchUserShortName() {

        String a = RestAssured
                .given()
                .spec(Assured.REQUEST_SPECIFICATION)
                .body(new Search("Alberto", true))
                .when()
                .post()
                .then()
                .extract().body().asString();
        System.out.println(a);
    }
}

