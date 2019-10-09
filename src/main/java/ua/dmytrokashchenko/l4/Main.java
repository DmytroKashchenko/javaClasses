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

        System.out.println(13 << 3); //32 = 0
        System.out.println(13 >> 2);
        System.out.println(13 >>> 3);
        // 1  1  0  1 0 0 0
        // 64+32+16+8+4+2+1
        // 1101 -> 0001
        System.out.println(0.0/0.0 + 10);
        double c = 0;
        String str = String.format("%1.4f", c);
        System.out.println(str);

        int[] array = {1,2};
//        int x;
        for (final int x:array) {
            System.out.println(x);
        }

        float f = 29.1f;
        double d = 29.1;
        System.out.println(f == d);
        f = 29.1f;
        d = 29.1f;
        System.out.println(f == d);
        int it = 1;
        long l = 1L;
        System.out.println(it == l);
    }
}
