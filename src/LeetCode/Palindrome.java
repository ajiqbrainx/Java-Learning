package LeetCode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 123;
        int y = x;
        boolean palindrome = false;
        int check = 0;
        int rem;
        while (y > 0) {
            rem = y % 10;
            check = (check * 10) + rem;
            y = y / 10;
        }
        if (check == x) {
            palindrome = true;
        }
//        if (palindrome) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
