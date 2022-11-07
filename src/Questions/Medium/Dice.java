package Questions.Medium;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceCombinations("", 4);

        System.out.println(diceCombinationsReturnArrayList("", 4));

    }
    static void diceCombinations(String pro, int target){
        if (target == 0){
            System.out.println(pro);
            return;
        }

        for (int i = 1; i < 6 && i <= target; i++) {

            diceCombinations(pro + i, target - i);
        }
    }

    static ArrayList<String> diceCombinationsReturnArrayList(String pro, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        ArrayList<String > ans = new ArrayList<>();

        for (int i = 1; i < 6 && i <= target; i++) {

            ans.addAll(diceCombinationsReturnArrayList(pro + i, target - i));
        }

        return ans;
    }
}
