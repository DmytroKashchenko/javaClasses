package ua.dmytrokashchenko.l2;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Dmytro");
        user1.setSurname(null);
        user1.setActive(true);
        user1.setAge(29);
        System.out.println(user1.getName().length());
        System.out.println(user1.hashCode());
        System.out.println("DmytroKashchenko".hashCode());

        User1 testUser = new User1("Kyiv", 1101, "User'sName");
        System.out.println(testUser.getName());
        System.out.println(testUser.getAddress());
    }
}
