package ua.dmytrokashchenko.l1;

public class FibonacciNumber {

    public static int fibNLoop(int num){
        if (num <= 0) return -1;
        int res = 1;
        int first = 1;
        int second = 1;
        if (num <= 2){
            return res;
        }
        else {
            for (int i = 0; i < num - 2; i++){
                res = first + second;
                first = second;
                second = res;
            }
            return res;
        }
    }

    public static int fibNRec(int num){
        if (num <= 0) return -1;
        if (num <= 2) return 1;
        return fibNRec(num - 1) + fibNRec(num - 2);
    }
}
