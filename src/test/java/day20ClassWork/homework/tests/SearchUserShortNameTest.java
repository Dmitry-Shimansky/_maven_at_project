package day20ClassWork.homework.tests;

import day20ClassWork.Search;
import day20ClassWork.homework.object.Data;
import day20ClassWork.homework.object.User;
import day20ClassWork.homework.utils.Assured;
import day20ClassWork.homework.utils.JsonParser;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

public class SearchUserShortNameTest {
    @Test
    public void searchUserShortName() {

        String name = "a";

        Data as = RestAssured
                .given()
                .spec(Assured.REQUEST_SPECIFICATION)
                .body(new Search(name, true))
                .when()
                .post()
                .then()
                .extract().body().as(Data.class);

        User user = JsonParser.getUser(name);
        System.out.println(as.data.contains(user));
        Assert.assertTrue("names match", as.data.contains(user));
    }
}

