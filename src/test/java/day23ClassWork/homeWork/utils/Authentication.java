package day23ClassWork.homeWork.utils;

import day23ClassWork.homeWork.settings.ConfigCreds;
import io.restassured.authentication.PreemptiveBasicAuthScheme;

public class Authentication {

    public static PreemptiveBasicAuthScheme authSheme() {

        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName(ConfigCreds.TESTRAIL_LOGIN);
        authScheme.setPassword(ConfigCreds.TESTRAIL_PASSWORD);

        return authScheme;
    }
}
