package ua.project.l2;

//import static org.junit.Assert.*;
import static ua.project.l2.Calc.calc;

import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CalcTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void init() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void destroy() {
        System.out.println("After class");
    }

    @Before
    public void initBeforeEachMethod() {
        System.out.println("After each method");
    }

    @Test
    @Ignore("Причина")
    public void shouldSumOfArguments() {
        int actual = Calc.calc(1, "+", 1);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

//    @Test(expected = RuntimeException.class)
//    @Test
//    public void shouldThrowExceptionForNullOperator() {
//        try {
//            calc(1, null, 2);
//        } catch (RuntimeException e) {
//            System.out.println("yes!");
//            String message = e.getMessage();
//
//        }
//        expectedException
//        calc(1, null, 2);
//    }
}