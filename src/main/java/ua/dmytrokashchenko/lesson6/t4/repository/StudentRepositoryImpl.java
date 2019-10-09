package ua.dmytrokashchenko.lesson6.t4.repository;

import ua.dmytrokashchenko.lesson6.t4.domain.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private Map<Long, Student> idToStudent = new HashMap<>();
    private static Long counter = 0L;

    @Override
    public Student save(Student student) {
//        student.
        return idToStudent.put(++counter, student);
    }

    @Override
    public Student findById(Long id) {
        return idToStudent.get(id);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public Student deleteById(Long id) {
        return idToStudent.remove(id);
    }
}
