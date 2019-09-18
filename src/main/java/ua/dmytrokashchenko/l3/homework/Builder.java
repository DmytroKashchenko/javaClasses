package ua.dmytrokashchenko.l3.homework;

public interface Builder {
    User buildUser();
    Builder withName(String name);
    Builder withSurname(String surname);
    Builder withEmail(String email);
    Builder withPassword(String password);
    Builder withCode(int code);
}
