package ua.dmytrokashchenko.consoleapp.service;

import ua.dmytrokashchenko.consoleapp.domain.Student;

import java.util.Comparator;

public class StudentsSortByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
