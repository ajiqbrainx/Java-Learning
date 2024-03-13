package Mine.InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
    public static void main(String[] args) {

        String name = "abcdaabc";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            char value = name.charAt(i);

            if (map.containsKey(value)) {
                for (Map.Entry<Character, Integer> entryValue : map.entrySet()) {
                    if (entryValue.getKey().equals(value)) {
                        map.put(entryValue.getKey(), entryValue.getValue() + 1);
                        break;
                    }

                }

            } else {
                map.put(value,1);
            }
        }

        System.out.println(map);
    }
}
