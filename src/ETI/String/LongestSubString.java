package ETI.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubString {
    public static void main(String[] args) {

        String name = "geeksforgeeks";
//        eksforg
//        ksforge
        List<Character> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder outputBuilder = new StringBuilder();
        List<String> output = new ArrayList<>();


        for (int i = 0; i < name.length(); i++) {
            for (int j = i; j < name.length(); j++) {

                if (!list.contains(name.charAt(j))) {
                    list.add(name.charAt(j));
                    stringBuilder.append(name.charAt(j));
                } else {
                    System.out.println(outputBuilder.length());
                    if (stringBuilder.length() > outputBuilder.length()) {
                        outputBuilder = stringBuilder;
                    }
//                    outputBuilder = outputBuilder.length() < stringBuilder.length() ?stringBuilder: outputBuilder ;
                    output.add(stringBuilder.toString());

                    stringBuilder.setLength(0);

                    list = new ArrayList<>();
                    break;
                }
            }

        }

        System.out.println("fdsfds  " + outputBuilder);
        System.out.println(output);


    }
}
