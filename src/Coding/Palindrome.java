package Coding;

public class Palindrome {
    public static void main(String[] args) {
        int palindrome = 222222222;
        int palindromeCheck =222222222;
        int rev = 0, rem;
        while (palindrome != 0) {
            rem = palindrome % 10;
            rev = (rev * 10) + rem;
            palindrome = palindrome / 10;
        }

        if (palindromeCheck == rev) System.out.println("Its is palindrome...");
        else System.out.println("Its is not palindrome...");


    }
}
