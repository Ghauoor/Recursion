package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, ans);

        return ans;
    }

    private void solve(int index, int[] nums, List<List<Integer>> ans) {

        // Base Condition
        if (index >= nums.length) {

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {

                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            solve(index + 1, nums, ans);

            swap(nums, index, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
