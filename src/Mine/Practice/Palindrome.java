package Mine.Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        StringBuilder output = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            output.append(word.charAt(i));
        }

        if (word.equals(output.toString())) {
            System.out.println("Its palindrome");
        } else System.out.println("Its not palindrome");
    }
}
