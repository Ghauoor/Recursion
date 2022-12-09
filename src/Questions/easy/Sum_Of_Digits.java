package Questions.easy;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(34));

    }

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }
}
