package ua.dmytrokashchenko.consoleapp.repository;

import ua.dmytrokashchenko.consoleapp.domain.Department;

import java.util.List;

public interface DepartmentRepository {
    Department save(Department department);

    Department findById(Long id);

    Department update(Long id, Department department);

    Department deleteById(Long id);

    List<Department> findDepartments();
}
