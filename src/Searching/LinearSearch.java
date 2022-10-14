package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(linearSearch(arr,5,0));
        System.out.println(find(arr,5,0));

    }
    static int linearSearch(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
       return linearSearch(arr, target, index+1);
    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length)
            return false;

        return arr[index] == target || find(arr, target, index+1);
    }
}
