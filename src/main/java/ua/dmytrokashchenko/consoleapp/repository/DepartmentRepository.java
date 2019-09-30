package ua.dmytrokashchenko.lesson7.homework.repository;

import ua.dmytrokashchenko.lesson7.homework.domain.Department;

public interface DepartmentRepository {
    Department save(Department department);
    Department findById(Long id);
    Department update(Long id, Department department);
    Department deleteById(Long id);
}
