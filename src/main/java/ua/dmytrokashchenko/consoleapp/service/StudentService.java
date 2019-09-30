package ua.dmytrokashchenko.lesson7.homework.service;

import ua.dmytrokashchenko.lesson7.homework.domain.Student;

import java.util.List;

public interface StudentService {
    Student register(Student student);
    List<Student> getAllStudents();
}
