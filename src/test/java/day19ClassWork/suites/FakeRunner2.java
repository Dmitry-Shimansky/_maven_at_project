package day19ClassWork.suites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "day23ClassWork.CustomCuke"},
        glue = {"day19ClassWork.steps"},
        features = {"src/test/resources/features/fake/FakeTwo.feature"}
)

public class FakeRunner2 {
}
