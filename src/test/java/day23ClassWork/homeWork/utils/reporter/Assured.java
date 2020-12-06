package day23ClassWork.homeWork.utils.reporter;

import day23ClassWork.homeWork.suites.ConfigUrls;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Assured {

    public static RequestSpecification requestSpecification(PreemptiveBasicAuthScheme authScheme) {

        final RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri(ConfigUrls.TESTRAIL)
                .setPort(8000)
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .setAuth(authScheme)
                .log(LogDetail.ALL)
                .build();
        return REQUEST_SPECIFICATION;
    }
}