package String;

 class Palindrome {
    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if ((str.charAt(left)) != (str.charAt(right)))
            return false;

        return isPalindrome(str, left + 1, right - 1);
    }
}
