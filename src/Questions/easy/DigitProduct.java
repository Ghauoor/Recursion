package Questions.easy;

public class DigitProduct {
    public static void main(String[] args) {
        int n = 22;

        System.out.println(prodOfDigit(n));

    }
    static int prodOfDigit(int n){
        if (n == 0) {
            return 0;
        }

        return (n % 10) + prodOfDigit(n / 10);
    }
}
