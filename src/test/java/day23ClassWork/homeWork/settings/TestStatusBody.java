package day23ClassWork.homeWork.settings;

public class TestStatusBody {

    public static String body(int stat) {

        String body = "{\"status_id\": " + stat + "," +
                "\"comment\": \"This test Dimitrius\"," +
                "\"elapsed\": \"15s\"," +
                "\"defects\": \"TR-7\"," +
                "\"version\": \"1.0 RC1 build 3724\"}";
        return body;
    }
}
