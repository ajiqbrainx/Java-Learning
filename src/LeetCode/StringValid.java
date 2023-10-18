package LeetCode;

import java.util.HashMap;

public class StringValid {
    public static void main(String[] args) {
        String s = "{[]}";

        HashMap<Character, Character> stringMatch = new HashMap<>();
        stringMatch.put('(', ')');
        stringMatch.put('[', ']');
        stringMatch.put('{', '}');

        boolean validStringPresent = false;

        outerLoop:
        for (int i = 0; i < s.length(); i += 2) {
            for (int j = i + 1; j < s.length(); j++) {
                if (stringMatch.containsKey(s.charAt(i))) {
                    if (s.charAt(j) == stringMatch.get(s.charAt(i)).charValue()) {
                        validStringPresent = true;
                        break;
                    } else {
                        validStringPresent = false;
                        break outerLoop;
                    }

                }
            }
        }

        System.out.println(validStringPresent);
    }
}
