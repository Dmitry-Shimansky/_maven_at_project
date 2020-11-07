package resources.tests;

import org.junit.Test;
import resources.pages.VoidPORegistratePage;

public class VoidPORegistrateTest {
    private VoidPORegistratePage registrateUser;

    @Test
    public void registrate () throws InterruptedException {
        registrateUser.registrateUser();
        registrateUser.clickEnterButton();
        registrateUser.enterPassword("2091353");
        registrateUser.clickCreateAccountButton();
    }
}
