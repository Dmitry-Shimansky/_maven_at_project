package hometestwork.runners.testngyaml;

import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.util.List;

public class BookingTestNgXmlSuite {
    public static void main(String[] args) throws IOException {
        final TestNG testNG = new TestNG(true);
        final Parser parser = new Parser("src/test/java/hometestwork/runners/testngyaml/testing.yaml");
        final List<XmlSuite> suites = parser.parseToList();
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
