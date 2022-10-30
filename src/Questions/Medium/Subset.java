package Questions.Medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
        System.out.println();

        System.out.println(subset(arr));
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

    public static List<List<Integer>> subset(int[] arr) {

        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;

        subsetHelper(arr, index, output, ans);
        return ans;
    }

    public static void subsetHelper(int[] arr, int index, List<Integer> output, List<List<Integer>> ans) {
        if (index >= arr.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        output.add(arr[index]);

        subsetHelper(arr, index + 1, output, ans);

        output.remove(output.size() - 1);

        subsetHelper(arr, index + 1, output, ans);
    }

}
