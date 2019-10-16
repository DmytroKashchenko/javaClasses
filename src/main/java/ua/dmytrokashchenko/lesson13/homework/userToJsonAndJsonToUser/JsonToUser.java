package ua.dmytrokashchenko.lesson13.homework.userToJsonAndJsonToUser;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonToUser {
    public static User jsonToUser(String fileName) {
        String json = null;
        Gson gson = new Gson();
        try {
            json = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("File reading failed");
        }
        return gson.fromJson(json, User.class);
    }
}
