package hometestwork.runners.junit4runners;

import hometestwork.pages.google.ConfirmAccount;
import hometestwork.tests.ConfirmAccountTest;
import hometestwork.tests.LoginTest_Booking;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        RegistrationTest.class,
//        LoginTest_Booking.class,
        ConfirmAccountTest.class
})

public class JUnit4Runner_Mix {
}
