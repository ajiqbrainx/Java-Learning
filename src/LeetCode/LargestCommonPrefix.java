package LeetCode;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"abcd", "abicd", "acds"};
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];

        System.out.println(first);
        System.out.println(last);

    }
}
