package Questions.easy;

public class DigitSum {
    public static void main(String[] args) {
        int n = 1235;

        System.out.println("Sum of given Number is "+sumOfDigit(n));


    }

    static int sumOfDigit(int n){
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigit(n / 10);
    }

}
