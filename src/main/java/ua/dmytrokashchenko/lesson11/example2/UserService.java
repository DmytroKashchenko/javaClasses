package ua.dmytrokashchenko.lesson11.example2;

public class UserService {
    public String findUserById(Long id) {
        for (int i = 0; i < 9000000; i++) {
            String a = new String("hello");
        }
        return null;
    }
}
