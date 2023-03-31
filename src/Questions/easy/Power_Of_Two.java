package Questions.easy;
//https://leetcode.com/problems/power-of-two/
public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;

        return (n == 1) || (n % 2 == 0 && isPowerOfTwo(n / 2));
    }
}
