package ua.dmytrokashchenko.lesson6;

import java.util.Scanner;

public class Stepik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a+b > c && b+c > a && c+a > b) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        in.close();
    }
}
