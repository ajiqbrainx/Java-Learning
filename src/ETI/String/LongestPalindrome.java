package ETI.String;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        String finalOutput = "";

        if (s.length() == 1) {
            return s;
        }


        for (int i = 0; i < s.length(); i++) {
            for (int j = i ; j < s.length(); j++) {
                str.append(s, i, j + 1);
                String input = str.toString();
                String output = str.reverse().toString();
                if (input.equals(output)) {
                    list.add(input);
                }
                str.setLength(0);
            }
        }

        for (String palin : list) {
            if (palin.length() > finalOutput.length()) {
                finalOutput = palin;
            }
        }

        return finalOutput;


    }

    public static void main(String[] args) {


        String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";

        System.out.println(longestPalindrome(s));
    }
}
