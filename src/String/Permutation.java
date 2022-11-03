package String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        String processed = "";
        int left = 0;
        int right = str.length();


        ArrayList<String> ans = permutationReturnArrayList(processed, str);

        System.out.println(ans);

        permute(str, left, right);

        permutation(processed, str);

    }

    //Using processed and unProcessed String Concept

    static void permutation(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());

            permutation(f + ch + s, unProcessed.substring(1));
        }
    }

    // Return the Value in a ArrayList
    static ArrayList<String> permutationReturnArrayList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {

            String f = processed.substring(0, i);
            String s = processed.substring(i, processed.length());

            ans.addAll(permutationReturnArrayList(f + ch + s, unProcessed.substring(1)));
        }

        return ans;
    }

    static void permute(String str, int left, int right) {

        if (left == right) {
            System.out.println(str);
            System.out.println();
            return;
        }

        for (int i = 0; i < right; i++) {
            str = swap(str, left, i);

            permute(str, left + 1, right);

            str = swap(str, left, i);
        }


    }

    private static String swap(String str, int left, int right) {

        StringBuffer stringBuffer = new StringBuffer(str);

        stringBuffer.setCharAt(left, str.charAt(right));
        stringBuffer.setCharAt(right, str.charAt(left));

        return stringBuffer.toString();
    }
}
