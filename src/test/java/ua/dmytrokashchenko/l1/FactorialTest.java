package ua.dmytrokashchenko.l1;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factTest() {
        BigInteger someNumber = BigInteger.valueOf(5);
        int expectedValue = 120;
        int actualValue = Factorial.fact(someNumber).intValue();
        assertEquals(expectedValue, actualValue);
    }
}
