package ua.dmytrokashchenko.consoleapp.domain;

import java.time.LocalDate;
import java.util.Optional;

public class Student {
    private final Long id;
    private final String name;
    private final String surname;
//    private final Optional<String> name;
//    private final Optional<String> surname;
    private final LocalDate birthday;
    private final Address address;
    private final Department department;
    private final String studyGroup;
    private final PhoneNumber phoneNumber;
    private final String email;

    private Student(Builder builder) {
        this.id =  builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.birthday = builder.birthday;
        this.address = builder.address;
        this.department = builder.department;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.studyGroup = builder.studyGroup;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
//        return name.orElseGet(() -> "Empty");
        return name;
    }

    public String getSurname() {
//        return surname.orElseGet(() -> "Empty");
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    @Override
    public String toString() {
        return id.toString() + "\t" +
                name + " " +
                surname + "\t" +
                birthday.toString() + "\t" + department.toString() +
                "\t" + studyGroup;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String surname;
//        private Optional<String> name;
//        private Optional<String> surname;
        private LocalDate birthday;
        private Address address;
        private Department department;
        private PhoneNumber phoneNumber;
        private String email;
        private String studyGroup;

        public Builder() {
        }

        public Student build() {
            return new Student(this);
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
//            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
//            this.name = Optional.ofNullable(surname);
            return this;
        }

        public Builder setBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setDepartment(Department department) {
            this.department = department;
            return this;
        }

        public Builder setPhoneNumber(PhoneNumber phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setStudyGroup(String studyGroup) {
            this.studyGroup = studyGroup;
            return this;
        }
    }
}
