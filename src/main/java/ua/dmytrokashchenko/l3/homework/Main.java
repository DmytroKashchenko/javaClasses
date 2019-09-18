package ua.dmytrokashchenko.l3.homework;

public class Main {
    public static void main(String[] args) {
        Builder uBuilder = new UserBuilder();
        uBuilder.withName("SomeName").withSurname("SomeSurname").withEmail("SnSs@gmail.com");
        uBuilder.withCode(42).withPassword("42snSs");
        User someUser = uBuilder.buildUser();
        System.out.println(someUser);
    }
}
