package Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));

        int [] arr1 = {2,3,4,5};
        int [] arr2 = {2,6,44,3,2};

        System.out.println(Arrays.toString(merge(arr1,arr2)));

    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // Edge case one of the array is not complete
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}