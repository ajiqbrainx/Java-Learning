package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class StringDuplicate {
    public static void main(String[] args) {
        String name = "javazz0121205";

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < name.length(); i++) {
            if (!list.contains(name.charAt(i))) {
                list.add(name.charAt(i));
            } else {
                if (name.charAt(i) >= 'a' && name.charAt(i) < 'z') {
                    char nextChar = (char) (name.charAt(i) + 1);
                    while (list.contains(nextChar)) {
                        nextChar = (char) (nextChar + 1);
                    }
                    list.add(nextChar);
                } else if (name.charAt(i) == 'z') {
                    char nextChar = 'a';
                    while (list.contains(nextChar)) {
                        nextChar = (char) (nextChar + 1);
                    }
                    list.add(nextChar);
                }
                else if (name.charAt(i) >= '0' && name.charAt(i) < '9') {
                    char nextChar = (char) (name.charAt(i) + 1);
                    while (list.contains(nextChar)) {
                        nextChar = (char) (nextChar + 1);
                    }
                    list.add(nextChar);
                }else if (name.charAt(i) == '0') {
                    char nextChar = '1';
                    while (list.contains(nextChar)) {
                        nextChar = (char) (nextChar + 1);
                    }
                    list.add(nextChar);
                }
            }

        }
        System.out.println(list);
    }
}
