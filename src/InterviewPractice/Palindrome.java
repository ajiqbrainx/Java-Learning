package InterviewPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        String output = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char value = name.charAt(i);
            output = output + value;
        }

        System.out.println(name);
        System.out.println(output);
        if (name.equals(output)) {
            System.out.println("Its palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
    }
}

