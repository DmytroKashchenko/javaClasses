package ua.dmytrokashchenko.l1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger factNumber = BigInteger.valueOf(5);
        System.out.println(Factorial.fact(factNumber));

        System.out.println("Loop method: " + FibonacciNumber.fibNLoop(22));
        System.out.println("Recursion method: " + FibonacciNumber.fibNRec(42));

        int[] array = new int[]{12, 10, 67, 35, 17};
        Sort.printArr(array);
        Sort.bubbleSort(array);
        Sort.printArr(array);
        int[] array1 = new int[]{12, 10, 67, 35, 17};
        Sort.selSort(array1);
        Sort.printArr(array1);
        int[] array2 = new int[]{12, 10, 67, 35, 17};
        Sort.insSort(array2);
        Sort.printArr(array2);
    }
}
