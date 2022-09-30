package Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9};
        int target = 4;

        System.out.println(bS(arr, target, 0, arr.length));

    }


    static int bS(int[] arr, int target, int start, int end){

        // Base case
        if (start > end){
            return -1;
        }
        int middle = start + (end - start) / 2;

        if (arr[middle] == target){
            return middle;
        }

        if (target < arr[middle]) {
           return bS(arr, target, start, middle - 1);
        }
        return bS(arr, target, middle+1, end);
    }
}
