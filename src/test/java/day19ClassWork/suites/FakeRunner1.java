package day19ClassWork.suites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"steps.fake"},
        features = {"src/test/features/fake/FakeOne.feature"}
)

public class FakeRunner1 {
}
