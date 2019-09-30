package ua.dmytrokashchenko.lesson7.homework.repository;

import ua.dmytrokashchenko.lesson7.homework.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {
    private Map<Long, Student> idToStudents = new HashMap<>();
    private static Long counter = 0L;

    @Override
    public Student save(Student student) {
        return idToStudents.put(++counter,student);
    }

    @Override
    public Student findById(Long id) {
        return idToStudents.get(id);
    }

    @Override
    public void update(Long id, Student student) {
        idToStudents.put(id, student);
    }

    @Override
    public Student deleteById(Long id) {
        return idToStudents.remove(id);
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return new ArrayList<Student>(idToStudents.values());
    }
}
