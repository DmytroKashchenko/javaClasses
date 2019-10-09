package ua.dmytrokashchenko.consoleapp.repository;

import org.springframework.stereotype.Repository;
import ua.dmytrokashchenko.consoleapp.domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
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
    public ArrayList<Student> findStudents() {
        return new ArrayList<Student>(idToStudents.values());
    }
}
