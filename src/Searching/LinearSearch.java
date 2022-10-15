package Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5};
        System.out.println(linearSearch(arr,5,0));
        System.out.println(find(arr,5,0));
        findAllIndexes(arr,5,0);
        System.out.println(list);

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


    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndexes(int[] arr, int target, int index){
        if (index == arr.length){
            return  ;
        }
        if (arr[index] == target){
          list.add(index)  ;
        }
        findAllIndexes(arr, target, index+1);
    }
}
