package ua.dmytrokashchenko.consoleapp.service;

import ua.dmytrokashchenko.consoleapp.domain.Student;

import java.util.Comparator;

public class StudentSortByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
