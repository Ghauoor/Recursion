package Questions.Medium;

public class Dice {
    public static void main(String[] args) {
        diceCombinations("", 4);

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
}
