package ua.dmytrokashchenko.consoleapp.service;

import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.domain.Student;
import ua.dmytrokashchenko.consoleapp.repository.DepartmentRepository;
import ua.dmytrokashchenko.consoleapp.repository.StudentRepository;

import java.util.List;

public interface DepartmentService {
    Department register(Department department);

    List<Department> getAllDepartments();

//    List<Student> getStudentsOfDepartment(StudentRepository studentRepository, Department department);
}
