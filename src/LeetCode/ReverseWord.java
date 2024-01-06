package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String s = " hi  macha ";
        int length = s.length() - 1;
        List<String> list = new ArrayList<>();
        reverse(s, list, 0, length);
        List<String> output = list.stream().filter(f -> !f.equals("")).collect(Collectors.toList());

        System.out.println(output);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = output.size() - 1; i >= 0; i--) {
            stringBuilder.append(output.get(i));
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
      String vs=  stringBuilder.toString();
        System.out.println(vs);
    }

    static List reverse(String s, List<String> list, int currentIndex, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = currentIndex; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                stringBuilder.append(s.charAt(i));
            } else {
                list.add(stringBuilder.toString());
                return reverse(s, list, i + 1, length);
            }
        }
        list.add(stringBuilder.toString());
        return list;
    }


}
