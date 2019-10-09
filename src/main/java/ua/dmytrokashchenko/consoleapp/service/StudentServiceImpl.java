package ua.dmytrokashchenko.consoleapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.domain.Student;
import ua.dmytrokashchenko.consoleapp.exceptions.InvalidEmailException;
import ua.dmytrokashchenko.consoleapp.repository.StudentRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student register(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student must exist");
        }
        if (!EmailValidatorService.validateEmail(student.getEmail())) {
            try {
                throw new InvalidEmailException("Email address is incorrect");
            } catch (InvalidEmailException e) {
                e.printStackTrace();
            }
        }
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findStudents();
    }

    @Override
    public List<Student> getStudentsByDepartment(Department department) {
        List<Student> allStudents = this.getAllStudents();
        List<Student> students = new ArrayList<Student>();
        for (Student student : allStudents) {
            if (student.getDepartment().equals(department)) {
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public List<Student> getStudentsByDepartmentAndGroup(Department department, String group) {
        List<Student> allStudents = this.getAllStudents();
        List<Student> students = new ArrayList<Student>();
        for (Student student : allStudents) {
            if (student.getDepartment().equals(department) && student.getStudyGroup().equals(group)) {
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public List<Student> getStudentsBornAfter(LocalDate date) {
        List<Student> allStudents = this.getAllStudents();
        List<Student> students = new ArrayList<Student>();
        for (Student student : allStudents) {
            if (student.getBirthday().compareTo(date) >= 0) {
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public List<Student> getListOfGroup(String groupName) {
        List<Student> allStudents = this.getAllStudents();
        List<Student> students = new ArrayList<Student>();
        for (Student student : allStudents) {
            if (student.getStudyGroup().equals(groupName)) {
                students.add(student);
            }
        }
        return students;
    }
}
