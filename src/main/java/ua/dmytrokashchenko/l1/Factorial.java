package ua.dmytrokashchenko.l1;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger fact( BigInteger number ) {
        return number.intValue() == 0 ? BigInteger.valueOf(1) :
                number.multiply(fact(number.subtract(BigInteger.valueOf(1))));
    }
}
