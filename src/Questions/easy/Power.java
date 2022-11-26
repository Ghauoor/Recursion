package Questions.easy;

public class Power {
    int power(int base, int exp) {
        //base case

        if (exp < 0) {
            return -1;
        }

        return base * power(base, exp - 1);
    }
}
