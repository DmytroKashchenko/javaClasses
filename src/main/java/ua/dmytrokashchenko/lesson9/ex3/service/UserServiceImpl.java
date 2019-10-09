package ua.dmytrokashchenko.lesson9.ex3.service;

import ua.dmytrokashchenko.lesson9.ex3.domain.User;
import ua.dmytrokashchenko.lesson9.ex3.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private final PasswordEncoder passwordEncoder;

//    @Autowired
    public UserServiceImpl(UserRepository userRepository,
                           UserValidator userValidator, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(User user) {
        userValidator.validate(user);

        // encode password
        String password = user.getPassword();
        String encodePassword = passwordEncoder.encode(password);

        // new User

        return userRepository.save(user);
    }

    @Override
    public User login(String login, String password) {
        String encodePassword = passwordEncoder.encode(password);

//        userRepository.findByEmail(login).orElseThrow(()-> EntityNotFindException(""));
//        String userPassword =
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
