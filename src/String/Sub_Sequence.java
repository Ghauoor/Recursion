package String;

import java.util.ArrayList;

public class Sub_Sequence {
    public static void main(String[] args) {
        subSeq("", "gh");
        System.out.println();
        System.out.println(subSeqArrayList("", "gh"));

    }

    static void subSeq(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        char ch = unProcessed.charAt(0);

        subSeq(processed + ch, unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }

    static ArrayList<String> subSeqArrayList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> left = subSeqArrayList(processed + ch, unProcessed.substring(1));
        ArrayList<String> right = subSeqArrayList(processed, unProcessed.substring(1));

        left.addAll(right);
        return left;
    }
}
