package hometestwork.tests;

import hometestwork.driver.Driver;
import hometestwork.pages.mailru.MailRuConfirmAccountPage;
import hometestwork.settings.ConfigURLs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MailRuConfirmAccountTest {
//    private MailRuConfirmAccountPage confirm = new MailRuConfirmAccountPage();

    @Before
    public void doBefore() {
        Driver.getWebDriver().get(ConfigURLs.MAILRU);
    }

    @Test
    public void loginMailRuTest() {
//        confirm.enterEmailAndSubmit();
//        confirm.enterPassAndSubmit();
//        confirm.enterToEmail();

    }

    @After
    public void doAfter() {
        Driver.destroy();
    }
}
