package Basics;

import java.util.ArrayList;
import java.util.List;

public class StringAlapabet {
    public static void main(String[] args) {

        String name = "abcabcdefab";
        List<String> outputList = new ArrayList<>();
        var output = alfabet(name, outputList, 0);
        System.out.println(output);
        int length = 0;
        for (int i = 0; i < output.size(); i++) {
            int word = output.get(i).toString().length();
            if (word > length) {
                length = word;
            }

        }
        System.out.println(length);


    }

    static List alfabet(String name, List<String> outputList, int index) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = index; i < name.length(); i++) {
            if (stringBuilder.isEmpty()) {
                stringBuilder.append(name.charAt(i));
            } else {
                int length = stringBuilder.length() - 1;
                int previous = stringBuilder.charAt(length);
                int currentValue = name.charAt(i);
                if (previous + 1 == currentValue) {
                    stringBuilder.append(name.charAt(i));
                } else {
                    outputList.add(stringBuilder.toString());
                    return alfabet(name, outputList, i);
                }
            }


        }
        if (!stringBuilder.isEmpty()) {
            outputList.add(stringBuilder.toString());
        }
        return outputList;

        }

}
