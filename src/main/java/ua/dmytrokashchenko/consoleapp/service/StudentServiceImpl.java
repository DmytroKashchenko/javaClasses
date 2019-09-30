package ua.dmytrokashchenko.lesson7.homework.service;

import ua.dmytrokashchenko.lesson7.homework.domain.Student;
import ua.dmytrokashchenko.lesson7.homework.repository.StudentRepository;
import ua.dmytrokashchenko.lesson7.homework.repository.StudentRepositoryImpl;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl() {
        studentRepository = new StudentRepositoryImpl();
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student must exist");
        }
        return studentRepository.save(student);
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}
