package ua.dmytrokashchenko.lesson5.classes;

public class User {
    private String name;
    private String surname;
    private static final String CODE;

    static {
        System.out.println("User");
        CODE = "CODE_OUTER";
    }


/*    {
        if (true) {
            throw new Throwable();
        }
    }*/


    public User(String name, String surname) /*throws Throwable*/ {
        this.name = name;
        this.surname = surname;
        System.out.println(Address.CODE_INNER);
        new Address(101).addressMethod();
        Address.addressStaticMethod();
    }

    public void userMethod() {
        System.out.println("user method");
    }

    public static void userStaticMethod() {
        System.out.println("user static method");
    }

    public static class Address {
        private static final String CODE_INNER/* = "CODE_INNER"*/;
        private int code;
        static {
            CODE_INNER = "CODE_INNER";
            System.out.println("Address");
        }

        public Address(int code) {
            this.code = code;
            System.out.println(CODE);
            new User("", "").userMethod();
            userStaticMethod();
        }

        private void addressMethod() {
            System.out.println("address method");
        }

        private static void addressStaticMethod() {
            System.out.println("address static method");
        }
    }
}
