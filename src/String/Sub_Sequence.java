package String;

public class Sub_Sequence {
    public static void main(String[] args) {
        subSeq("", "abc");

    }
    static void subSeq(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }

        char ch = unProcessed.charAt(0);

        subSeq(processed + ch, unProcessed.substring(1));
        subSeq(processed, unProcessed.substring(1));
    }
}
