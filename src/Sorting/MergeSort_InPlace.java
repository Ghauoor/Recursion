package Sorting;


import java.util.Arrays;

public class MergeSort_InPlace {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        // mergeSortInPlace(arr, 0, arr.length);
        // System.out.println(Arrays.toString(arr));
        sorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = s + (e - s) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        //Size of sub-arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Temp Arrays
        int[] L = new int[n1];
        int[] R = new int[n2];


        // Copy the Data of arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merging
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    static void sorting(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            mergeTheArrays(arr, left, mid, right);
        }
    }

    private static void mergeTheArrays(int[] arr, int left, int mid, int right) {

        //pointers
        int i = left;
        int j = mid+1;
        int k = left;

        //Array
        int[] mix = new int[arr.length];

        //merging
        while (i <= mid && j <= right){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //Edge
        if (i > mid){
            while (j <= right){
                mix[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid){
                mix[k] = arr[i];
                i++;
                k++;
            }
        }

        //copy the array
        for (k = left; k <= right; k++){
            arr[k] = mix[k];
        }
    }
}
