package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MergeString {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "1234";
        StringBuilder stringBuffer = new StringBuilder();
        String output = rotation(word1, word2, stringBuffer, 0, 0, word1.length() + word2.length()).toString();
        System.out.println(output);
    }

    static StringBuilder rotation(String word1, String word2, StringBuilder stringBuffer, int i, int j, int count) {


        if (count == stringBuffer.length()) {
            return stringBuffer;
        }


        if (i < word1.length()) {
            stringBuffer.append(word1.charAt(i));
        }
        if (j < word2.length()) {
            stringBuffer.append(word2.charAt(i));
        }

        return rotation(word1, word2, stringBuffer, i + 1, j + 1, count);
    }

}

