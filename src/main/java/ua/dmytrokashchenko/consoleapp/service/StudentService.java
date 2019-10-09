package ua.dmytrokashchenko.consoleapp.service;

import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.domain.Student;
import ua.dmytrokashchenko.consoleapp.exceptions.InvalidEmailException;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    Student register(Student student) throws InvalidEmailException;
    List<Student> getAllStudents();
    List<Student> getStudentsByDepartment(Department department);
    List<Student> getStudentsByDepartmentAndGroup(Department department, String group);
    List<Student> getStudentsBornAfter(LocalDate date);
    List<Student> getListOfGroup(String groupName);
}
