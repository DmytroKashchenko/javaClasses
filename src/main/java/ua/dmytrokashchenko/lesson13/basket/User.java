package ua.dmytrokashchenko.lesson13.basket;

import ua.dmytrokashchenko.lesson13.homework.userToXmlAndXmlToUser.Address;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "User")
@XmlType(propOrder = {"name", "email", "age", "address"})

public class User {
    private static Long COUNTER = 0L;
    private final Long id;
    private String userName;
    private String email;
    private String password;
    private int age;
    private Address address;

    public User(Builder builder) {
        this.id = ++COUNTER;
        this.userName = builder.userName;
        this.email = builder.email;
        this.password = builder.password;
        this.age = builder.age;
        this.address = new Address(builder.address.getCity(),
                builder.address.getStreet(),
                builder.address.getBuildingNumber());
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public static class Builder {
        private String userName;
        private String email;
        private String password;
        private int age;
        private Address address;

        public Builder() {
        }

        public Builder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
