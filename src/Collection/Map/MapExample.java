package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> nameAndAge = new HashMap<>();  //The only drawback is Order of elements is not provide
        nameAndAge.put("Abi", 24);
        nameAndAge.put("Ajith", 23);
        nameAndAge.put("Ashok", 24);
        nameAndAge.put(null, 2);
        nameAndAge.put("jill", 13);
        nameAndAge.put("jillz", 12);
        System.out.println(nameAndAge);
//        for (Map.Entry<String, Integer> name : nameAndAge.entrySet()) {
//            System.out.println(name.getKey());
//            System.out.println(name.getValue());
//        }


    }
}
