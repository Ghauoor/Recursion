package Questions.easy;

public class PrintN {
    public static void main(String[] args) {
        int n = 5;
        funRev(n);



    }
    static void fun(int n){

        if (n == 0) return;

        System.out.println(n);

        fun(n-1);
    }

    static void funRev(int n){

        if (n == 0) return;

        funRev(n-1);
        System.out.println(n);


    }
}
