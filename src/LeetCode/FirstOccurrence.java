package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        List<String> list = new ArrayList<>();

        occurrence(haystack, needle, list, 0, needle.length());


    }

    static List occurrence(String haystack, String needle, List<String> list, int index, int length) {

        StringBuilder stringBuilder = new StringBuilder();
        if (index < haystack.length()) {
            for (int i = index; i < length; i++) {
                stringBuilder.append(haystack.charAt(i));
            }
            if (stringBuilder.toString().equals(needle)) {
                list.add(stringBuilder.toString());
            }
            occurrence(haystack, needle, list, index + 1, length + 1);
        }

        return list;
    }

}
