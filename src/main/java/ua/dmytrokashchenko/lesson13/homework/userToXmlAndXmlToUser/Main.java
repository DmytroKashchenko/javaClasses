package ua.dmytrokashchenko.lesson13.homework.userToXmlAndXmlToUser;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kyiv", "first street", 12);
        User user = new User(11L, "Dmytro",
                "user@email.com", "pass", 28, address);
        UserToXML.userToXml(user, "user.xml");
        System.out.println(user);
        User userFromFile = XmlToUser.xmlToUser("user.xml");
        System.out.println("User from file:\n" + userFromFile);
    }
}
