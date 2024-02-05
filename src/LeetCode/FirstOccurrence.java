package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurrence {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int length = haystack.length() - needle.length();

        List<String> list = new ArrayList<>();

        occurrence(haystack, needle, list, 0, needle.length(),length );


    }

    static List occurrence(String haystack, String needle, List<String> list, int index, int length, int lastIndex) {

        StringBuilder stringBuilder = new StringBuilder();

        if (index <= lastIndex) {
            for (int i = index; i < length; i++) {
                stringBuilder.append(haystack.charAt(i));
            }
            if (stringBuilder.toString().equals(needle)) {
                list.add(stringBuilder.toString());
            }
            occurrence(haystack, needle, list, index + 1, length + 1, lastIndex);
        }

        return list;
    }

}
