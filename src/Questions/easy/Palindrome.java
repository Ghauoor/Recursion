package Questions.easy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1212;

        System.out.println(palindromeNum(n));

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
    //Palindrome
    static boolean palindromeNum(int n){
        return (n == revNum(n));
    }
}
