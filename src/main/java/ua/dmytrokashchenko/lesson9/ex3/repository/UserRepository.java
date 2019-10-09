package ua.dmytrokashchenko.lesson9.ex3.repository;

import ua.dmytrokashchenko.lesson9.ex3.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User>findById(Long id);
    // if no user return empty list
    List<User>findAll();
    List<User>findByName(String name);
    Optional<User>findByEmail(String email);
}
