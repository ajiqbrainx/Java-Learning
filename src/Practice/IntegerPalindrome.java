package Practice;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int finalCheck = number;
        int rem, reverse = 0;


        while (number != 0) {
            rem = number % 10;
            reverse = (10 * reverse) + rem;
            number = number / 10;
        }
        if (reverse == finalCheck) {
            System.out.println("Its palindrome");
        } else System.out.println("Its not a palindrome");
    }
}
