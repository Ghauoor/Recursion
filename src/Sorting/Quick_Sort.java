package Sorting;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {0, 0, 2, 1, 2, 5, 7, 8, 9};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {

            //If Array is sorted swaping will not occure
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        //Pivot is at its correct position
        sort(arr, low, end);
        sort(arr, start, high);
    }

    // Quick Sort Using Adjacent Element
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (i < high && arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, j, low);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);

        }
    }
}
