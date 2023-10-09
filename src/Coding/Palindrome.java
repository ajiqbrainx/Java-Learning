package Coding;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int check = number;
        int palindrome = number;

        int rev = 0, rem;
        while (palindrome != 0) {
            rem = palindrome % 10;
            rev = (rev * 10) + rem;
            palindrome = palindrome / 10;
        }

        if (check == rev) System.out.println("Its is palindrome...");
        else System.out.println("Its is not palindrome...");


    }
}
