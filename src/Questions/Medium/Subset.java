package Questions.Medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(subsets(arr));

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

}
