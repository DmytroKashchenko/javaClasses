package ua.dmytrokashchenko.lesson11.example2;

public class ProxyUserService {
    private final UserService userService;
    private long timeDelta;

    public ProxyUserService(UserService userService) {
        this.userService = userService;
    }

    public long getTimeDelta() {
        return timeDelta;
    }

    public String findById(Long id) {
        long start = System.currentTimeMillis();
        String userById = userService.findUserById(id);
        long end = System.currentTimeMillis();
        timeDelta = end - start;
        return userById;
    }
}
