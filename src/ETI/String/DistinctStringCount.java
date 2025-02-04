package ETI.String;

import java.util.HashMap;
import java.util.Map;

public class DistinctStringCount {
    public static void main(String[] args) {

        String name = "aaaaabcafwsf qfweafdwefd ";

        HashMap<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }


}
