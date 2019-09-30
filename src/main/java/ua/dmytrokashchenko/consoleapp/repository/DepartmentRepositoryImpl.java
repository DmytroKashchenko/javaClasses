package ua.dmytrokashchenko.lesson7.homework.repository;

import ua.dmytrokashchenko.lesson7.homework.domain.Department;

import java.util.HashMap;
import java.util.Map;

public class DepartmentRepositoryImpl implements DepartmentRepository {
    private Map<Long, Department> idToDepartment = new HashMap<>();
    private static Long counter = 0L;

    @Override
    public Department save(Department department) {
        return idToDepartment.put(++counter, department);
    }

    @Override
    public Department findById(Long id) {
        return idToDepartment.get(id);
    }

    @Override
    public Department update(Long id, Department department) {
        return idToDepartment.put(id, department);
    }

    @Override
    public Department deleteById(Long id) {
        return idToDepartment.remove(id);
    }
}
