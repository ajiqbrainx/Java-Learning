package JavaInterview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapwithExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ajith");
        map.put(2, "Ajith");
        map.put(3, "Ajith");
        map.put(4, "Ajith");
        map.put(5, "Ajith");

        for (Map.Entry<Integer, String> number : map.entrySet()) {
            System.out.println(number.getKey() + " => " + number.getValue());
        }
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry keyAndValue = (Map.Entry) itr.next();
            System.out.println(keyAndValue);
        }
    }
}
