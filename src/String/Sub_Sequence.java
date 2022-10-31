package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sub_Sequence {
    public static void main(String[] args) {
        subSeq("", "gh");
        System.out.println();
        System.out.println(subSeqArrayList("", "gh"));
        System.out.println();
        subSeqWithASCII("", "gh");
        System.out.println();
        System.out.println(subSeqArrayListASCII("", "gh"));
        System.out.println();

        subseqItrativly("gh", 2);


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

    //Subseq with ASCII value
    static void subSeqWithASCII(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        char ch = unProcessed.charAt(0);

        subSeqWithASCII(processed + ch, unProcessed.substring(1));
        subSeqWithASCII(processed, unProcessed.substring(1));
        subSeqWithASCII(processed + (ch + 0), unProcessed.substring(1));
    }

    //ASCII return with ArrayList

    static ArrayList<String> subSeqArrayListASCII(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        ArrayList<String> first = subSeqArrayListASCII(processed + ch, unProcessed.substring(1));
        ArrayList<String> second = subSeqArrayListASCII(processed, unProcessed.substring(1));
        ArrayList<String> third = subSeqArrayListASCII(processed + (ch + 0), unProcessed.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;
    }


    static void subseqItrativly(String str, int n){
        for (int i = 0; i < n; i++){
            for (int j = i+1; j <= n; j++){
                System.out.println(str.substring(i,j));
            }
        }
    }

}
