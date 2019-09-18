package ua.dmytrokashchenko.l4;

public class B extends A {
    public static void method() {
        System.out.println("class B");
    }
    public static void method(int a) {
        System.out.println("class B, method(int a)");
    }
    public void method(double a) {
        System.out.println("public void method(double a)");
    }
}
