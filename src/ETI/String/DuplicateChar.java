package ETI.String;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DuplicateChar {
    public static void main(String[] args) {
        String name = "manojpandey";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            String letter = String.valueOf(name.charAt(i));
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<String, Integer> ss : map.entrySet()) {
            var output = ss.getValue() > 1;
            if (output) {
                System.out.println(ss.getKey() + " Its duplicate");
            }
        }
    }
}
