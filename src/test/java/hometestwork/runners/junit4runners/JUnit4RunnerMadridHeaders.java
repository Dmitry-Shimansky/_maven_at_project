package hometestwork.runners.junit4runners;

import hometestwork.tests.BookingFindMadridTest;
import hometestwork.tests.BookingVerifyAllHeadersTest;
import hometestwork.tests.GoogleConfirmAccountTest;
import hometestwork.tests.MailRuConfirmAccountTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        RegistrationTest.class,
//        LoginTest_Booking.class,
//        GoogleConfirmAccountTest.class
        BookingFindMadridTest.class,
        BookingVerifyAllHeadersTest.class
})

public class JUnit4RunnerMadridHeaders {
}
