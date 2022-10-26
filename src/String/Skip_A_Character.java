package String;

public class Skip_A_Character {
    public static void main(String[] args) {

        skipChar("", "baccad");

        System.out.println(skip("baccad"));

        System.out.println(skipString("appledkjns"));

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


    static String skip( String unProcessed){
        if (unProcessed.isEmpty()){
            return "";
        }
        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
           return skip(unProcessed.substring(1));
        } else {
           return ch + skip(unProcessed.substring(1));
        }
    }
    static String skipString( String unProcessed){
        if (unProcessed.isEmpty()){
            return "";
        }

        if (unProcessed.startsWith("apple")){
            return skipString(unProcessed.substring(5));
        } else {
            return unProcessed.charAt(0) + skip(unProcessed.substring(1));
        }
    }
}
