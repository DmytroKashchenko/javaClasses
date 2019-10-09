package ua.dmytrokashchenko.l4.homework;

import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private String middleName;
    private Calendar birthdayDate;

    public Person(String name, String surname, String middleName, Calendar birthdayDate) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthdayDate = birthdayDate;
    }

}
