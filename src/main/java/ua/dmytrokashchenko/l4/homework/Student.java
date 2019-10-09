package ua.dmytrokashchenko.l4.homework;

import java.util.Calendar;

public class Student extends Person {
    private int id;
    private Address address;

    public Student(String name, String surname, String middleName, Calendar birthdayDate) {
        super(name, surname, middleName, birthdayDate);
    }
}
