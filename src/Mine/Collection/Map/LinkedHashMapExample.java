package Mine.Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> nameAge = new LinkedHashMap<>();  // Simlar to Hashmap is advantage is Order of
//        elements is provided ....

        nameAge.put("Abi", 22);
        nameAge.put("Ajith", 23);
        nameAge.put("Ashok", 24);
        nameAge.put("Akil", 25);
        System.out.println(nameAge);
    }
}
