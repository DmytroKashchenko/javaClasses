package ua.dmytrokashchenko.lesson6.t4.service;

import ua.dmytrokashchenko.lesson6.t4.domain.Student;
import ua.dmytrokashchenko.lesson6.t4.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if(student == null) {
            throw new IllegalArgumentException("");
        }
        return /*StudentRepository.save(student);*/ student;
    }
}
