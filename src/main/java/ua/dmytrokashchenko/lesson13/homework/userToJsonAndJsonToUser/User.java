package ua.dmytrokashchenko.lesson13.homework.userToJsonAndJsonToUser;

public class User {
    private Long id;
    private String userName;
    private String email;
    private String password;
    private int age;
    private Address address;

    public User() {
    }

    public User(Long id, String userName, String email, String password, int age, Address address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User: id: " + id + " User name: " + userName + " Email: " + email + " Age: " + age + " "
                + address.toString();
    }
}
