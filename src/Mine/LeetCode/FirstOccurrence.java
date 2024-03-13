package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int length = haystack.length() - needle.length();

        List<Integer> list = new ArrayList<>();

        var outputList = occurrence(haystack, needle, list, 0, needle.length(), length);

        int output = -1;


        if (!outputList.isEmpty()) {
            output = outputList.get(0);
        }
        System.out.println(output);
    }

    static List<Integer> occurrence(String haystack, String needle, List<Integer> list, int index, int length, int lastIndex) {

        StringBuilder stringBuilder = new StringBuilder();

        if (index <= lastIndex) {
            for (int i = index; i < length; i++) {
                stringBuilder.append(haystack.charAt(i));
            }
            if (stringBuilder.toString().equals(needle)) {
                list.add(index);
            }
            return occurrence(haystack, needle, list, index + 1, length + 1, lastIndex);
        }

        return list;
    }

}
