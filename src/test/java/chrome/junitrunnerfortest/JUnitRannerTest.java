package chrome.junitrunnerfortest;

import chrome.Booking;
import chrome.SelectDemo;
import chrome.W3School;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SelectDemo.class,
        W3School.class,
        Booking.class
})

public class JUnitRannerTest {
}
