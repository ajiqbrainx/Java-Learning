package InterviewPractice;

import java.util.Scanner;

public class ABCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Check if the entered character is a lowercase letter
        if (inputChar >= 'a' && inputChar < 'z') {
            char nextChar = (char) (inputChar + 1);
            System.out.println("The next character is: " + nextChar);
        } else if (inputChar == 'z') {
            System.out.println("The next character is: a"); // Wrap around for 'z'
        } else {
            System.out.println("Invalid input. Please enter a lowercase letter.");
        }

        scanner.close();
    }
}
