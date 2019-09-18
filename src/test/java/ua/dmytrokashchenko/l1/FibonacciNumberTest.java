package ua.dmytrokashchenko.l1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {

    @Test
    public void fibNLoopTest() {
        int expectedValue = 17711;
        int actualValue = FibonacciNumber.fibNLoop(22);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void fibNRecTest() {
        int expectedValue = 17711;
        int actualValue = FibonacciNumber.fibNRec(22);
        assertEquals(expectedValue, actualValue);
    }
}