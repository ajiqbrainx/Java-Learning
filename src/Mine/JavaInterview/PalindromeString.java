package JavaInterview;

import java.util.Scanner;

public class PalindromeString {

    static boolean palindrome(String name) {


        StringBuilder stringBuilder = new StringBuilder();
        char[] character = name.toCharArray();
        for (int i = name.length() - 1; i >= 0; i--) {
            stringBuilder.append(name.charAt(i));
        }
        if (stringBuilder.toString().equals(name)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        String name = "madam";
        System.out.println(palindrome(name));


    }
}
