package ua.dmytrokashchenko.lesson7.exemple;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
//
//public class User implements Comparable<User> {
//    private String name;
//    private String surname;
//    private int age;
//
//    @Override
//    public int compareTo(@NotNull User o) {
//        return this.age - o.age;
//    }
//}

public class User implements Comparable<User> {
    public static final Comparator<User> USER_COMPARATOR_BY_AGE =
            (user1, user2) -> user1.age - user2.age;
    private String name;
    private String surname;
    private int age;

    @Override
    public int compareTo(@NotNull User o) {
        return this.age - o.age;
    }
}

final class Utility {
    private Utility() {
    }

    public void swap(User[] users, int i, int j) {
        if (User.USER_COMPARATOR_BY_AGE.compare(users[i], users[j]) > 0) {
            //swap
            User tempUser = new User();
            tempUser = users[i];
            users[i] = users[j];
            users[j] = tempUser;
        }
    }
}


