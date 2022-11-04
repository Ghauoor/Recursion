package Questions.Medium;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {

        pad("", "12");
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

}
