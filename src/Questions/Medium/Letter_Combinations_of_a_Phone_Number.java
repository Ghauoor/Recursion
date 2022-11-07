package Questions.Medium;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {

        pad("", "1");
        System.out.println(padReturnArrayList("", "1"));

        System.out.println(padCount("","1"));

        System.out.println(letterCombinations("2"));
    }

    static void pad(String pro, String unPro) {
        if (unPro.isEmpty()) {
            System.out.println(pro);
            return;
        }

        //convert '2' to 2
        int digit = unPro.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            pad(pro + ch, unPro.substring(1));
        }
    }

    // return the arraylist in ans

    static ArrayList<String> padReturnArrayList(String pro, String unPro) {
        if (unPro.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();

            list.add(pro);
            return list;

        }

        //convert '2' to 2
        int digit = unPro.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(padReturnArrayList(pro + ch, unPro.substring(1)));

        }
        return list;
    }

    // Count the permutations

    static int padCount(String pro, String unPro) {
        if (unPro.isEmpty()) {

            return 1;
        }
        
        int count = 0;

        //convert '2' to 2
        int digit = unPro.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            count = count + padCount(pro + ch, unPro.substring(1));
        }
        return count;
    }

    static public List<String> letterCombinations(String digits) {

        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        StringBuilder output = new StringBuilder();
        int index = 0;
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinationsHelper(digits, output, index, mapping, ans);
        return  ans;
    }

    private static void letterCombinationsHelper(String digits, StringBuilder output, int index,
                                                 String[] mapping, ArrayList<String> ans) {

        if (index >= digits.length()){
            ans.add(output.toString());
            return;
        }

        int num = digits.charAt(index) - '0';
        String value = mapping[num];

        for (int i = 0; i < value.length(); i++){

            output.append(value.charAt(i));

            letterCombinationsHelper(digits, output, index + 1, mapping, ans);

            output.deleteCharAt(output.length() - 1);

        }

    }


}
