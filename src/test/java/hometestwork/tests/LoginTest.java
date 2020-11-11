package hometestwork.tests;

import org.junit.Test;
import hometestwork.pages.LoginPage;

public class LoginTest {
    private LoginPage loginPage;

    @Test
    public void loginTest() {

        loginPage.enterLoginAndPass("Peter","Parker");
        loginPage.clickEnterButton();

    }
}
