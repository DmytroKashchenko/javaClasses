package ua.dmytrokashchenko.lesson9.ex3;

import java.util.List;

public interface UserService {
    User register(User user);

    User login(String login, String password);

    List<User> findAll();
}
