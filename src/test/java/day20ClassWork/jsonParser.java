package day20ClassWork;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonParser {
    private final static String JSON = "src/test/resources/testData/jsonFile";

    File file = new File(JSON);

    public void parseJSON() throws IOException {
        String input = new String(Files.readAllBytes(Paths.get(JSON)));
        JSONObject obj = new JSONObject(input);

        System.out.println(obj.getString("recipename"));
        System.out.println(obj.getJSONArray("ingredList"));
        System.out.println(obj.getNumber("preptime"));
    }

    public void parseGSON() throws FileNotFoundException {
        Gson gson = new Gson();
        recipe.Recipe recipe = gson.fromJson(new JsonReader(new FileReader(JSON)), day20ClassWork.recipe.Recipe.class);
        System.out.println(recipe.recipename);
        System.out.println(recipe.ingredList);
    }

    public static String fromGSON(Search search) {
        Gson gson = new Gson();
        return gson.toJson(search);
    }
}
