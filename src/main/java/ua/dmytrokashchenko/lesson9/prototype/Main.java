package ua.dmytrokashchenko.lesson9.prototype;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Kyiv", 1101);
        Address address2 = new Address("Lviv", 1110);
        User user1 = new User(address1, "Vasya", "Vasenko");
        User user2 = null;
        try {
            user2 = user1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(user1.getName() + " -user1");
        System.out.println(Objects.requireNonNull(user2).getName() + " -user2");
        System.out.println(user1.getAddress() + " -user1");
        System.out.println(user2.getAddress() + " -user2");
        user1.setName("Vova");
        user1.setAddress(address2);
        System.out.println(user1.getName() + " -user1");
        System.out.println(user2.getName() + " -user2");
        System.out.println(user1.getAddress() + " -user1");
        System.out.println(user2.getAddress() + " -user2");
    }
}
