package ua.dmytrokashchenko.lesson9.prototype;

public class User implements Cloneable {
    private Address address;
    private String name;
    private String surname;

    public User() {
    }

    public User(Address address, String name, String surname) {
        this.address =address;
        this.name = name;
        this.surname = surname;
    }

    public User(User target) {
        this.address = target.address;
        this.name = target.name;
        this.surname = target.surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.address = this.address.clone();
        return clone;
    }
}
