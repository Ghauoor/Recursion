package Questions.Medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
        System.out.println();

        System.out.println(subSet(arr));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int num : nums) {

            for (int j = 0, size = result.size(); j < size; j++) {
                List<Integer> subset = new ArrayList<>(result.get(j));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }


    //-->Solution

    public static List<List<Integer>> subSet(int[] arr){
        List<Integer> output = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(arr, 0, output, ans);
        return ans;
    }

    private static void helper(int[] arr, int index, List<Integer> output, List<List<Integer>> ans) {

        if (index >= arr.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        output.add(index);
        helper(arr, index+1, output, ans);
        output.remove(output.size() - 1);

        helper(arr, index+1,output, ans);
    }
}
