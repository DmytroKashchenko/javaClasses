package ua.dmytrokashchenko.lesson5.solid;

public interface Service {
    // UserService
    void registrate(User user);

    void login(String password, String login);
// MessageService
//    void sendMessage(Message message);
// HelpService
    String getCountries();
}
