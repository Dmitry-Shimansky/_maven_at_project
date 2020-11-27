package day19ClassWork.steps;

import drivers.Config;
import drivers.Driver;

import io.cucumber.core.api.Scenario;
import org.junit.After;
import org.junit.Before;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FakeBaseSteps {

    private static double passed,failed;
    private static List<String> failedNames = new ArrayList<>();

    static {
        afterAll();
    }

    @Before
    public void doBefore() {
        System.out.println("Init Web Driver");
//        Driver.setConfig(Config.CHROME);
    }

    @After
    public void doAfter(Scenario scenario) {

        if (scenario.isFailed()) {
            failedNames.add(scenario.getName() + "at line"
            + scenario.getLine() + System.getProperty("line.separator"));
            failed++;
        }else {
            passed++;
        }
//        Driver.destroy();
    }

    public static void afterAll() {
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            StringBuilder sb = new StringBuilder();
            String ls = System.getProperty("line.separator");

            sb.append("Text execution report!");
            sb.append("Test executed: ").append(passed + failed).append(ls);
            sb.append(" - passed: ").append(passed).append(ls);
            sb.append(" - failed: ").append(failed).append(ls);
            sb.append(" - pass ratio: ").append((passed/(passed + failed))*100).append("%").append(ls);
            sb.append("Failed list").append(ls);
            failedNames.forEach(sb::append);

            System.out.println(sb.toString());

            File file = new File("report.txt");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}
