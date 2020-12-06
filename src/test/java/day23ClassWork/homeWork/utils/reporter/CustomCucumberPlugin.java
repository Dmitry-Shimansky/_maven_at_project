package day23ClassWork.homeWork.utils.reporter;

import cucumber.api.Result;
import cucumber.api.event.*;
import day23ClassWork.homeWork.settings.TestStatusBody;
import day23ClassWork.homeWork.utils.reporter.Assured;
import day23ClassWork.homeWork.utils.reporter.Authentication;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CustomCucumberPlugin implements ConcurrentEventListener {

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, getTestRunStartedHandler());
        publisher.registerHandlerFor(TestCaseStarted.class, getTestCaseStartedHandler());
        publisher.registerHandlerFor(TestStepStarted.class, getTestStepStartedHandler());
        publisher.registerHandlerFor(TestStepFinished.class, getTestStepFinishedHandler());
        publisher.registerHandlerFor(TestCaseFinished.class, getTestCaseFinishedHandler());
        publisher.registerHandlerFor(WriteEvent.class, getWriteEventHandler());
        publisher.registerHandlerFor(EmbedEvent.class, getEmbedEventHandler());
        publisher.registerHandlerFor(TestRunFinished.class, getTestRunFinishedHandler());
    }

    private EventHandler<TestRunStarted> getTestRunStartedHandler() {
        return event -> {
            System.out.println(event.getTimeStamp());
        };
    }

    private EventHandler<TestCaseStarted> getTestCaseStartedHandler() {
        return event -> {
            System.out.println(event.getTestCase());
        };
    }

    private EventHandler<TestStepStarted> getTestStepStartedHandler() {
        return event -> {
            System.out.println(event.testStep);
        };
    }

    private EventHandler<TestStepFinished> getTestStepFinishedHandler() {
        return event -> {
            System.out.println(event.getTimeStamp());
        };
    }

    private EventHandler<TestCaseFinished> getTestCaseFinishedHandler() {
        return event -> {

            Result.Type status = event.result.getStatus();

            int result = new day23ClassWork.homeWork.utils.reporter.Result().Result(status);

            int caseId = Integer.parseInt(event.testCase.getTags().stream().findFirst().get().getName().substring(1));

            TestRailConnector.testRailResultSend(caseId,TestRailConnector.testRailAuthentication(),result);

//            System.out.println(
//                    RestAssured
//                            .given()
//                            .spec(Assured.requestSpecification(Authentication.authSheme()))
//                            .body(TestStatusBody.body(result))
//                            .when()
//                            .post("index.php?/api/v2/add_result_for_case/413/" + caseId)
////                    .get("index.php?/api/v2/get_cases/7&suite_id=358")
//                            .then()
//                            .extract().body().asString()
//            );
        };
    }

    private EventHandler<WriteEvent> getWriteEventHandler() {
        return event -> {
            System.out.println(event.text);
        };
    }

    private EventHandler<EmbedEvent> getEmbedEventHandler() {
        return event -> {
            System.out.println(event.data);
        };
    }

    private EventHandler<TestRunFinished> getTestRunFinishedHandler() {
        return event -> {
            System.out.println(event.getTimeStamp());
        };
    }
}
