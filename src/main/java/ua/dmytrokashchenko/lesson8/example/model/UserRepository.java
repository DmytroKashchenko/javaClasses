package ua.dmytrokashchenko.lesson8.example.model;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);

    List<User> findAll();

    Optional<User> findByID(Long id);
}
