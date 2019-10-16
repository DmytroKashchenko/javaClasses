package ua.dmytrokashchenko.lesson13.homework.userToJsonAndJsonToUser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class UserToJson {
    public static void userToJson(User user, String fileName) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.flush();
        } catch (IOException e) {
            System.out.println("File writing failed");
        }
    }
}
