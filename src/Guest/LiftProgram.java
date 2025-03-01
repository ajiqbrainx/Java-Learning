package Guest;

import java.util.HashMap;
import java.util.Map;

public class LiftProgram {
    public static void main(String[] args) {



        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 20);
        map.put('b', 22);
        map.put('c', 19);
        map.put('d', 30);

        int nearest = 30;
        char finalChar = ' ';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() < nearest) {
                nearest = entry.getValue();
                finalChar = entry.getKey();
            }
        }

        System.out.println("Lift " + finalChar + " is the nearest");

    }
}
