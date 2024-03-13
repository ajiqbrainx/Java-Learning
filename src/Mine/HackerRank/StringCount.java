package Mine.HackerRank;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();

        int length = myString.length();
        check(myString, length);

    }

    static void check(String myString, int length) {
        int space = myString.indexOf(' ');
        String A = myString.substring(0, space);
        String B = myString.substring(space + 1);
        String firstLetter = A.substring(0, 1).toUpperCase();
        A = firstLetter + A.substring(1);

        String secondLetter = B.substring(0, 1).toUpperCase();
        B = secondLetter + B.substring(1);

//        int a = A.length();
//        int b = B.length();
//        int length = a + b;
        System.out.println(length - 1);

        if (A.length() >= B.length()) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        System.out.println(A + " " + B);
    }
}
