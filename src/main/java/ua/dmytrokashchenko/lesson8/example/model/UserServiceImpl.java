package ua.dmytrokashchenko.lesson8.example.model;

@Component
public class UserServiceImpl implements UserService {

//    @Inject
    private final UserRepository userRepository;

    @Inject
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }
}
