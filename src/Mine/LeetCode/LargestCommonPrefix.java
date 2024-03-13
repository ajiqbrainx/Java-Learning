package LeetCode;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flower","flower","flower"};

        Character dummy = null;

        StringBuffer stringBuffer = new StringBuffer();


        int index = 0;
        outerLoop:
        for (int j = 0; j ==index; j++) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].isEmpty() || index >= strs[i].length() ) {
                    break outerLoop;
                } else if (i != 0 && index < strs[i].length()) {
                    if (dummy == strs[i].charAt(index)) {
                    } else {
                        break outerLoop;
                    }
                } else if (i == 0) {
                    if (index < strs[i].length()) {
                        dummy = strs[i].charAt(index);
                    }
                }
            }
            stringBuffer.append(dummy);
            dummy = null;
            index++;
        }
        String output = stringBuffer.toString();

        System.out.println(output);
    }
}
