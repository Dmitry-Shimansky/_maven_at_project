package hometestwork.runners.junit4runners;

import hometestwork.tests.NewMail_RegistrationTest_Booking;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        LoginTest_TrashMail.class,
        NewMail_RegistrationTest_Booking.class
})
public class JUnit4Runner_CheckRegistration_Booking {
}
