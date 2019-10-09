package ua.dmytrokashchenko.consoleapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.repository.DepartmentRepository;

import java.util.ArrayList;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department register(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public ArrayList<Department> getAllDepartments() {
        return (ArrayList<Department>) departmentRepository.findDepartments();
    }
}
