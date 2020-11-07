package resources.tests;

import org.junit.Test;
import resources.pages.VoidPOLoginPage;

public class VoidPOLoginTest {
    private VoidPOLoginPage loginPage;

    @Test
    public void loginTest() {

        loginPage.enterLoginAndPass("Peter","Parker");
        loginPage.clickEnterButton();

    }
}
