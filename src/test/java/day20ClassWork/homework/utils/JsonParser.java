package day20ClassWork.homework.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import day20ClassWork.homework.object.Data;
import day20ClassWork.homework.object.User;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonParser {
    public static User getUser(String name) {

        Gson gson = new Gson();

        Data data = null;
        try {
            data = gson.fromJson(
                    new JsonReader(
                            new FileReader("/Users/DmitryShimansky/IdeaProjects/DemoMavenProject/src/test/resources/testData/users.json")), Data.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data.data.stream()
                .filter(user -> user.username.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
