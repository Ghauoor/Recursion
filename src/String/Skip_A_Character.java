package String;

public class Skip_A_Character {
    public static void main(String[] args) {

        skipChar("", "baccad");


    }
    static void skipChar(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            skipChar(processed, unProcessed.substring(1));
        } else {
            skipChar(processed+ch, unProcessed.substring(1));
        }
    }
}
