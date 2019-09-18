package ua.dmytrokashchenko.l3.homework;
// Builder
public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private int code;

    public User(String name, String surname, String email, String password, int code) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getPasswordLength() {
        return password.length();
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code=" + code +
                '}';
    }
}
