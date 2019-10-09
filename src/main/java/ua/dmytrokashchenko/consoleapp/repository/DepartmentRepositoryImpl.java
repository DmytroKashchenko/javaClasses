package ua.dmytrokashchenko.consoleapp.repository;

import org.springframework.stereotype.Repository;
import ua.dmytrokashchenko.consoleapp.domain.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
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

    @Override
    public ArrayList<Department> findDepartments() {
        return new ArrayList<Department>(idToDepartment.values());
    }
}
