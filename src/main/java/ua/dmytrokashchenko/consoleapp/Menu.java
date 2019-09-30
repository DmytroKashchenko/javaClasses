package ua.dmytrokashchenko.lesson7.homework;

import ua.dmytrokashchenko.lesson7.homework.domain.Student;
import ua.dmytrokashchenko.lesson7.homework.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

import static ua.dmytrokashchenko.lesson7.homework.service.Init.*;

public class Menu {
    private static final String MENU = "\tMenu:";

    public void run() {
        StudentServiceImpl studentService = Init();
        switch (showMenu()) {
            case 1:
                ArrayList<Student> allStudents = studentService.getAllStudents();
                for (Student a : allStudents) {
                    System.out.println(a);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }

    private int showMenu() {
        System.out.println(MENU);
        System.out.println("1 - Show all students");
        System.out.println("2 - Show all departments");
        System.out.println("3 - Show students list of the department...");
        System.out.println("4 - Show students list of the department and group...");
        System.out.println("5 - Show list of students born after a given year...");
        System.out.println("6 - Show study group list...");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
