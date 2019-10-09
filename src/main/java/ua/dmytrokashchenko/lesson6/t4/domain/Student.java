package ua.dmytrokashchenko.lesson6.t4.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private final Long id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;
    private final Address address;
    private final Department department;
    private final PhoneNumber phoneNumber;

    private Student(Builder builder) {
        this.id =  builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthday = builder.birthday;
        this.address = builder.address;
        this.department = builder.department;
        this.phoneNumber = builder.phoneNumber;
    }

    public Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(address, student.address) &&
                Objects.equals(department, student.department) &&
                Objects.equals(phoneNumber, student.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthday, address, department, phoneNumber);
    }

    public static class Builder{
        private Long id;
        private String name;
        private String surname;
        private LocalDate birthday;
        private Address address;
        private Department department;
        private PhoneNumber phoneNumber;

        private Builder() {
        }
        
        public Student build() {
            return new Student(this);
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }
        
        
    }
}
