package ua.dmytrokashchenko.l3;

import ua.dmytrokashchenko.l3.singleton.Singleton1;

public class Main {
    public static void main(String[] args) {
//        User user = new User("Ivanov", "Ivan",
//                "ivanov@gmail.com", "password");
        User user = new User.Builder()
                .withName("Ivan")
                .withSurname("Ivanov")
                .build();
        Singleton1.SINGLETON_1.method();


    }
}
