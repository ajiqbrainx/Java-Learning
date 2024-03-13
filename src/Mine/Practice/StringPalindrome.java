package Mine.Practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = name.length() - 1; i >= 0; i--) {
            stringBuffer.append(name.charAt(i));
        }

        if (name.contentEquals(stringBuffer)) {
            System.out.println("Its palindrome");
        } else System.out.println("Its not a palindrome");
    }
}
