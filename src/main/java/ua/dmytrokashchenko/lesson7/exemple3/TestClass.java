package ua.dmytrokashchenko.lesson7.exemple3;

import ua.dmytrokashchenko.lesson7.exemple2.Test;

public class TestClass {
    @BeforeClass
    public static void staticInit() {
        System.out.println("static");
    }
    @Test
    public static void staticIni() {
        System.out.println("static");
    }
}
