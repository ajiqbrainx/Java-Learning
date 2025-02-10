package ETI.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordDuplicate {
    public static void main(String[] args) {

        String words = "I am a java developer and I am proud of it";

        HashMap<String, Integer> map = new HashMap<>();

        String[] array = words.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i].toLowerCase())) {
                map.put(array[i].toLowerCase(), map.get(array[i].toLowerCase()) + 1);
            } else {
                map.put(array[i].toLowerCase(), 1);
            }
        }


        for (Map.Entry<String, Integer> value : map.entrySet()) {
            var output = value.getValue() > 1;
            if (output) {
                System.out.println(value.getKey() + " Its is duplicate" );

            }

        }

    }
}
