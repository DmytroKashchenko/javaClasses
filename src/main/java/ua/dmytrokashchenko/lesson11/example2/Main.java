package ua.dmytrokashchenko.lesson11.example2;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProxyUserService proxyUserService = new ProxyUserService(userService);
        proxyUserService.findById(100L);
        System.out.println(proxyUserService.getTimeDelta());
    }
}
