package ua.dmytrokashchenko.l3.lambda;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    Map<String, CalcInterface> operators = new HashMap<>();
    {
        operators.put("+", (a, b) -> a + b);
        operators.put("-", (a, b) -> a - b);
        operators.put("*", (a, b) -> a * b);
        operators.put("/", (a, b) -> a / b);
    }



    public int calc(int arg1, String operator, int arg2) {
        return 0;
    }

}
