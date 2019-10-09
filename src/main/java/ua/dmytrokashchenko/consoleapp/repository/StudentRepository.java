package ua.dmytrokashchenko.consoleapp.repository;

import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.domain.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    // C
    Student save(Student student);

    // R
    Student findById(Long id);

    // U
    void update(Long id, Student student);

    // D
    Student deleteById(Long id);

    List<Student> findStudents();
}
