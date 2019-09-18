package ua.dmytrokashchenko.l3.homework;

public class UserBuilder implements Builder {
    private String name;
    private String surname;
    private String email;
    private String password;
    private int code;

    public UserBuilder() {
    }

    public User buildUser(){
        return new User(this.name, this.surname, this.email, this.password, this.code);
    }

    @Override
    public Builder withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public Builder withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Builder withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Builder withCode(int code) {
        this.code = code;
        return this;
    }
}
