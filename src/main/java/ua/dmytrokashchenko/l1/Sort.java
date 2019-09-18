package ua.dmytrokashchenko.l1;

public class Sort {

    private static void swap(int n1, int n2, int[] arr) {
        int tmp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = tmp;
    }

    public static void printArr(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void bubbleSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(j, j + 1, arr);
            }
        }
    }

    public static void selSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            int minI = i;
            for (int j = i + 1; j < arrLength; j++) {
                if(arr[j] < arr[minI]) minI = j;
            }
            swap(i, minI, arr);
        }
    }

    public static void insSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }
}
