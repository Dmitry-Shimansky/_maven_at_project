package resources.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import resources.utils.AcceptEmail;
import resources.utils.NewMail;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        NewMail.class,
        AcceptEmail.class
})

public class JUnit4Runner {
}
