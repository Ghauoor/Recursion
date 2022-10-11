package Questions;

public class Trailling_Zeros_Fictorial {
    public static void main(String[] args) {

        int n = 15;
        System.out.println(tailingZeros(n));

    }
    static int tailingZeros(int n){
        int res = 0;

        long divisor = 5;
        while (divisor <= n){
            res += n / divisor;
            divisor *= 5;
        }
        return res;
    }
}
