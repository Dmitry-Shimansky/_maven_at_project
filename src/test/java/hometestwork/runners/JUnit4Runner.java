package hometestwork.runners;

import hometestwork.tests.RegistrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import hometestwork.pages.AcceptEmail;
import hometestwork.pages.NewMail;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        NewMail.class,
//        AcceptEmail.class
        RegistrationTest.class
})

public class JUnit4Runner {
}
