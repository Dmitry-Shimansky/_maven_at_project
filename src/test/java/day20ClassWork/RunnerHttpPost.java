package day20ClassWork;

import java.io.IOException;
import java.net.URISyntaxException;

public class RunnerHttpPost {
    public static void main(String[] args) throws IOException, URISyntaxException {
        new httpClientGet().search(new Search("a",true));
    }
}
