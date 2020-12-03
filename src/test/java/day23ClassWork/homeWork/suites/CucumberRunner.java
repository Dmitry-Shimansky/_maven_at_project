package day23ClassWork.homeWork.suites;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "day23ClassWork.homeWork.utils.TestRailReport"},
        glue = {"day23ClassWork.homeWork.steps"},
        features = {"src/test/resources/features/fake/day23hWTextBoxSteps.feature"}
)
public class CucumberRunner {
}
