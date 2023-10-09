package Practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
