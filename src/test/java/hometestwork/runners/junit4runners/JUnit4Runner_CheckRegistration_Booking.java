package hometestwork.runners.junit4runners;

import hometestwork.tests.BookingRegistrationAndConfirmNewUserTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        LoginTest_TrashMail.class,
        BookingRegistrationAndConfirmNewUserTest.class
})
public class JUnit4Runner_CheckRegistration_Booking {
}
