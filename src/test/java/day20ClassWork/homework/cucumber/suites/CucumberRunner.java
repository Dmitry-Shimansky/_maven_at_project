package day20ClassWork.homework.cucumber.suites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"homework.cucumber.steps"},
        features = {"src/test/resources/features/fake/BookingLogin.feature"}
)

public class CucumberRunner {
}
