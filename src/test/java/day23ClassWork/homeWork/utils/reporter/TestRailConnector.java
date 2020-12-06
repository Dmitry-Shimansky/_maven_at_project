package day23ClassWork.homeWork.utils.reporter;

import cucumber.api.Result;
import day23ClassWork.homeWork.settings.TestStatusBody;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class TestRailConnector {

    public static RequestSpecification testRailAuthentication() {
        return Assured.requestSpecification(Authentication.authSheme());
    }

    public static void testRailResultSend(int caseId, RequestSpecification testRailAuthentication, int status_id) {

        RestAssured
                .given()
                .spec(testRailAuthentication)
                .body(TestStatusBody.body(status_id))
                .when()
                .post("index.php?/api/v2/add_result_for_case/413/" + caseId);
//                    .get("index.php?/api/v2/get_cases/7&suite_id=358")
    }
}
