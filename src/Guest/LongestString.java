package Guest;

import java.util.ArrayList;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {

        String input = "pwwkew";

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            List<Character> check = new ArrayList<>();
            for (int j = i; j < input.length(); j++) {
                if (!check.contains(input.charAt(j))) {
                    char inputChar = input.charAt(j);
                    check.add(inputChar);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int k = 0; k < check.size(); k++) {
                        stringBuilder.append(check.get(k));
                    }
                    outputList.add(stringBuilder.toString());
                    break;
                }
            }
        }

        var finalOutput = outputList.get(0);
        for (String name : outputList) {
            if (name.length() > finalOutput.length()) {
                finalOutput = name;
            }
        }


        System.out.println(finalOutput);
    }
}
