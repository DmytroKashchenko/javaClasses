package ua.dmytrokashchenko.lesson8.example.model;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findByID(Long id) {
        return Optional.empty();
    }
}
