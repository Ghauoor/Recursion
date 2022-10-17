package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int n) {

        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        bubbleSort(arr, n - 1);

    }
}
