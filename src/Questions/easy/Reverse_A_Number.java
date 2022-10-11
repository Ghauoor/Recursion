package Questions.easy;

public class Reverse_A_Number {
    public static void main(String[] args) {


        System.out.println(revNum(1234));

    }
    static int sum = 0;

    static void reverseNum(int n){
        if (n == 0) {
            return;
        }
        int rem = n % 10;

        sum = sum * 10 + rem;
        reverseNum(n / 10);
    }

    static int revNum(int n){
        // sometimes you might need some additional variables in the argument
        // in that case, make another function

        // num of digits
        int digit = (int)(Math.log10(n)) + 1;

        return helper(n , digit);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
