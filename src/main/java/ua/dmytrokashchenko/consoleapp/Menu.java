package ua.dmytrokashchenko.consoleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.dmytrokashchenko.consoleapp.domain.Address;
import ua.dmytrokashchenko.consoleapp.domain.Department;
import ua.dmytrokashchenko.consoleapp.domain.PhoneNumber;
import ua.dmytrokashchenko.consoleapp.domain.Student;
import ua.dmytrokashchenko.consoleapp.exceptions.InvalidEmailException;
import ua.dmytrokashchenko.consoleapp.service.DepartmentService;
import ua.dmytrokashchenko.consoleapp.service.StudentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@Component
public class Menu {
    private StudentService studentService;
    private DepartmentService departmentService;

    @Autowired
    public Menu(StudentService studentService, DepartmentService departmentService) {
        this.studentService = studentService;
        this.departmentService = departmentService;
    }

    public void run() { // need to add "while" loop
        this.fill(studentService, departmentService);
        switch (showMenu()) {
            case 1:
                showAllStudents();
                break;
            case 2:
                showAllDepartments();
                break;
            case 3:
                showStudentsByDepartment();
                break;
            case 4:
                showStudentsByDepartmentAndGroup();
                break;
            case 5:
                showStudentsBornAfter();
                break;
            case 6:
                showListOfGroup();
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }

    private int showMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Show all students");
        System.out.println("2 - Show all departments");
        System.out.println("3 - Show students list of the department...");
        System.out.println("4 - Show students list of the department and group...");
        System.out.println("5 - Show list of students born after a given year...");
        System.out.println("6 - Show study group list...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        for (Student a : allStudents) {
            System.out.println(a);
        }
    }

    private void showAllDepartments() {
        List<Department> allDepartments = departmentService.getAllDepartments();
        for (Department department : allDepartments) {
            System.out.println(department);
        }
    }

    private void showStudentsByDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the department: ");
        String name = scanner.nextLine();
        System.out.print("Enter the ID of the department: ");
        Long id = scanner.nextLong();
        System.out.println();
        Department department = new Department(id, name);
        List<Student> studentsByDepartment = studentService.getStudentsByDepartment(department);
        for (Student student : studentsByDepartment) {
            System.out.println(student);
        }
    }

    private void showStudentsByDepartmentAndGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the group: ");
        String groupName = scanner.nextLine();
        System.out.print("Enter the name of the department: ");
        String name = scanner.nextLine();
        System.out.print("Enter the ID of the department: ");
        Long id = scanner.nextLong();
        System.out.println();
        Department department = new Department(id, name);
        List<Student> studentsByDepartmentAndGroup =
                studentService.getStudentsByDepartmentAndGroup(department, groupName);
        for (Student student : studentsByDepartmentAndGroup) {
            System.out.println(student);
        }
    }

    private void showStudentsBornAfter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        LocalDate date = LocalDate.of(year, 1, 1);
        List<Student> studentsBornAfter = studentService.getStudentsBornAfter(date);
        for (Student student : studentsBornAfter) {
            System.out.println(student);
        }
    }

    private void showListOfGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the group: ");
        String groupName = scanner.nextLine();
        List<Student> group = studentService.getListOfGroup(groupName);
        for (Student student : group) {
            System.out.println(student);
        }
    }

    private void fill(StudentService studentService, DepartmentService departmentService) {
        Address address1 = new Address("UA", "Kyiv", "Street1", 11, 1011);
        Address address2 = new Address("UA", "Kyiv", "Street2", 22, 1012);
        Address address3 = new Address("UA", "Kyiv", "Street3", 33, 1013);
        Address address4 = new Address("UA", "Lviv", "Street4", 44, 1014);
        Address address5 = new Address("UA", "Lviv", "Street5", 55, 1015);
        Address address6 = new Address("UA", "Lviv", "Street6", 66, 1016);
        Department department1 = new Department(1L, "Dep1");
        Department department2 = new Department(2L, "Dep2");
        Department department3 = new Department(3L, "Dep3");
        Department department4 = new Department(4L, "Dep4");
        PhoneNumber phoneNumber1 = new PhoneNumber("+38(011)555-11-11");
        PhoneNumber phoneNumber2 = new PhoneNumber("+38(011)555-22-22");
        PhoneNumber phoneNumber3 = new PhoneNumber("+38(011)555-33-33");
        PhoneNumber phoneNumber4 = new PhoneNumber("+38(011)555-44-44");
        PhoneNumber phoneNumber5 = new PhoneNumber("+38(011)555-55-55");
        PhoneNumber phoneNumber6 = new PhoneNumber("+38(011)555-66-66");
        Student student1 = new Student.Builder().setId(1L).setName("Student1").setSurname("Surname1")
                .setEmail("S1email@email.com").setBirthday(LocalDate.of(1990, 1, 1))
                .setStudyGroup("Group1").setAddress(address1).setDepartment(department1).setPhoneNumber(phoneNumber1)
                .build();
        Student student2 = new Student.Builder().setId(2L).setName("Student2").setSurname("Surname2")
                .setEmail("S2email@email.com").setBirthday(LocalDate.of(1992, 2, 2))
                .setStudyGroup("Group1").setAddress(address2).setDepartment(department1).setPhoneNumber(phoneNumber2)
                .build();
        Student student3 = new Student.Builder().setId(3L).setName("Student3").setSurname("Surname3")
                .setEmail("S3email@email.com").setBirthday(LocalDate.of(1994, 3, 3))
                .setStudyGroup("Group2").setAddress(address3).setDepartment(department2).setPhoneNumber(phoneNumber3)
                .build();
        Student student4 = new Student.Builder().setId(4L).setName("Student4").setSurname("Surname4")
                .setEmail("S4email@email.com").setBirthday(LocalDate.of(1996, 4, 4))
                .setStudyGroup("Group2").setAddress(address4).setDepartment(department2).setPhoneNumber(phoneNumber4)
                .build();
        Student student5 = new Student.Builder().setId(5L).setName("Student5").setSurname("Surname5")
                .setEmail("S5email@email.com").setBirthday(LocalDate.of(1995, 5, 5))
                .setStudyGroup("Group3").setAddress(address5).setDepartment(department3).setPhoneNumber(phoneNumber5)
                .build();
        Student student6 = new Student.Builder().setId(6L).setName("Student6").setSurname("Surname6")
                .setEmail("S6email@email.com").setBirthday(LocalDate.of(1996, 6, 6))
                .setStudyGroup("Group4").setAddress(address6).setDepartment(department4).setPhoneNumber(phoneNumber6)
                .build();
        try {
            studentService.register(student1);
            studentService.register(student2);
            studentService.register(student3);
            studentService.register(student4);
            studentService.register(student5);
            studentService.register(student6);
        } catch (InvalidEmailException e) {
            e.printStackTrace();
        }
        departmentService.register(department1);
        departmentService.register(department2);
        departmentService.register(department3);
        departmentService.register(department4);
    }
}
