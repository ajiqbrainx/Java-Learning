package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastLengthString {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon";


//        var ss = s.split(" ");
//        System.out.println(Arrays.toString(ss));
//        String output = ss[ss.length - 1];
//        System.out.println(output);
//        int length = output.length();
//        System.out.println(length);

        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String value = String.valueOf(s.charAt(i));
            if (!value.equals(" ")) {
                stringBuilder.append(s.charAt(i));
            } else {
                if (!stringBuilder.isEmpty()) {
                    list.add(stringBuilder.toString().length());
                    stringBuilder.setLength(0);
                }
            }
        }
        if (!stringBuilder.isEmpty()) {
            list.add(stringBuilder.toString().length());
        }

        int output = list.get(list.size() - 1);
        System.out.println(output);
    }
}
