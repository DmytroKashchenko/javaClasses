package ua.dmytrokashchenko.lesson7.homework.repository;

import ua.dmytrokashchenko.lesson7.homework.domain.Student;

import java.util.ArrayList;

public interface StudentRepository {
    // C
    Student save(Student student);

    // R
    Student findById(Long id);

    // U
    void update(Long id, Student student);

    // D
    Student deleteById(Long id);

    ArrayList<Student> getAllStudents();
}
