package ua.dmytrokashchenko.lesson6.t4.repository;

// CRUD
// C - create
// R - read
// U - update
// D - delete

import ua.dmytrokashchenko.lesson6.t4.domain.Student;
// rename need
public interface StudentRepository {
    // C
    Student save(Student student);

    // R
    Student findById(Long id);

    // U
    void update(Student student);

    // D
    Student deleteById(Long id);
}
