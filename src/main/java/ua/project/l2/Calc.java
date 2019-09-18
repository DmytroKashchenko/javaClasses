package ua.project.l2;


public final class Calc {
    private Calc() {
        throw new  RuntimeException("utility class");
    }
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIV = "/";
    private static final String MUL = "*";



    public static int calc(int arg1, String operator, int arg2) {
//        int result;
//        if ("+".equals(operator)) {
//            return arg1 + arg2;
//        }
//        if ("-".equals(operator)) {
//            return arg1 - arg2;
//        }
//        if ("*".equals(operator)) {
//            return arg1 - arg2;
//        }
//        if ("/".equals(operator)) {
//            return arg1 - arg2;
//        } else {
//            throw new RuntimeException("error");
//        }
//        return result;
        // плюс і тд. в енам ?

        if (operator == null) {
            throw new RuntimeException("operator is null");
        }

        switch (operator) {
            case PLUS:
                return arg1 + arg2;
            case MINUS:
                return arg1 - arg2;
            case MUL:
                return arg1 * arg2;
            case DIV:
                return arg1 / arg2;
            default: throw new RuntimeException("error");
        }

    }
}
