package Questions.arrays;

public class Array_Sum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(arraySum(arr,arr.length));

    }
    static int arraySum(int[] arr, int n){
        if(n <= 0){
            return 0;
        }

        return (arraySum(arr, n-1)+arr[n-1]);
    }


}
