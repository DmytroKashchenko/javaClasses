package ua.dmytrokashchenko.lesson7.homework.service;

import ua.dmytrokashchenko.lesson7.homework.domain.Department;
import ua.dmytrokashchenko.lesson7.homework.repository.DepartmentRepository;

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department register(Department department) {
        return departmentRepository.save(department);
    }

}
