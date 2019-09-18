package ua.dmytrokashchenko.l4;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        if (a == 1 && b++ == 1){
            System.out.println("ok");
        }

        System.out.println(a);
        System.out.println(b);
        B z = new B();
        B.method();
        A.method();
        B.method(24);
    }
}
