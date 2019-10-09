package ua.dmytrokashchenko.lesson9.ex1;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Error();
        } catch (Error error) {
            System.out.println("oi error");
        }
    }
}
