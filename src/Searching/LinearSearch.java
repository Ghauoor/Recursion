package Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5};
        System.out.println(linearSearch(arr,5,0));
        System.out.println(find(arr,5,0));
        findAllIndexes(arr,5,0);
        System.out.println(list);

        System.out.println(findAllIndex(arr, 5,0, new ArrayList<>()));

        System.out.println(findAllIndexes2(arr, 5,0));



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
            return;
        }
        if (arr[index] == target){
          list.add(index)  ;
        }
        findAllIndexes(arr, target, index+1);
    }

    //Passing the Arraylist in Argument
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndexes2(int[] arr, int target, int index){
        //Need to create a new arraylist at every recursion call

        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that fuc call only
        if(arr[index] == target){
            list.add(index);
        }
         ArrayList<Integer> ansFromBelowCalls = findAllIndexes2(arr,target,index+1);
        //collect all the answer till now
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
