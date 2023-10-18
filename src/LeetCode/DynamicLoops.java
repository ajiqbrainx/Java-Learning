package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicLoops {
    public static void main(String[] args) {
        String digits = "";

        Map<Integer, List<String>> valueLists = new HashMap<>();
        valueLists.put(2, new ArrayList<>());
        valueLists.put(3, new ArrayList<>());
        valueLists.put(4, new ArrayList<>());
        valueLists.put(5, new ArrayList<>());
        valueLists.put(6, new ArrayList<>());
        valueLists.put(7, new ArrayList<>());
        valueLists.put(8, new ArrayList<>());
        valueLists.put(9, new ArrayList<>());

        valueLists.get(2).add("a");
        valueLists.get(2).add("b");
        valueLists.get(2).add("c");
        valueLists.get(3).add("d");
        valueLists.get(3).add("e");
        valueLists.get(3).add("f");
        valueLists.get(4).add("g");
        valueLists.get(4).add("h");
        valueLists.get(4).add("i");
        valueLists.get(5).add("j");
        valueLists.get(5).add("k");
        valueLists.get(5).add("l");
        valueLists.get(6).add("m");
        valueLists.get(6).add("n");
        valueLists.get(6).add("o");
        valueLists.get(7).add("p");
        valueLists.get(7).add("q");
        valueLists.get(7).add("r");
        valueLists.get(7).add("s");
        valueLists.get(8).add("t");
        valueLists.get(8).add("u");
        valueLists.get(8).add("v");
        valueLists.get(9).add("w");
        valueLists.get(9).add("x");
        valueLists.get(9).add("y");
        valueLists.get(9).add("z");


        List<String> output = new ArrayList<>();

        generateNestedLoops(digits, 0, "", valueLists, output);

//        for (String result : output) {
//            System.out.println(result);
//        }
        System.out.println(output);
    }

    public static void generateNestedLoops(String digits, int currentIndex, String currentLoop, Map<Integer, List<String>> valueLists, List<String> output) {
        if (currentIndex == digits.length()) {
            output.add(currentLoop);
        } else {
            char c = digits.charAt(currentIndex);
            List<String> valueList = valueLists.get(Character.getNumericValue(c));

            for (String value : valueList) {
                generateNestedLoops(digits, currentIndex + 1, currentLoop + value, valueLists, output);
            }
        }
    }
}
