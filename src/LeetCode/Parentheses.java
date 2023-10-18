package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parentheses {
    public static void main(String[] args) {
        int n = 2;
        List<String> output = new ArrayList<>();
        HashMap<Integer, List<Character>> stringHashMap = new HashMap<>();
        List<Character> list1 = new ArrayList<>();
        list1.add('(');
        list1.add(')');
        stringHashMap.put(1, list1);

        List<Character> list2 = new ArrayList<>();
        list2.add('(');
        list2.add(')');
        list2.add('(');
        list2.add(')');
        stringHashMap.put(2, list2);

        if (stringHashMap.containsKey(n)) {
            List<Character> list = stringHashMap.get(n);

            for (Character character : list) {
                System.out.print(character + " ");
            }
            System.out.println();
        }

    }
}
