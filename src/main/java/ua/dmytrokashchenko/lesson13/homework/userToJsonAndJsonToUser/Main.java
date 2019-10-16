package ua.dmytrokashchenko.lesson13.homework.userToJsonAndJsonToUser;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kyiv", "first street", 12);
        User user = new User(11L, "Dmytro",
                "user@email.com", "pass", 28, address);
        UserToJson.userToJson(user, "user.json");
        User userFromJson = JsonToUser.jsonToUser("user.json");
        System.out.println(userFromJson);
    }
}
