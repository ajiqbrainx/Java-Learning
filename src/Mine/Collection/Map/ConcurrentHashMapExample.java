package Mine.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();


        concurrentHashMap.put(0,"Zero");
        concurrentHashMap.put(5, "Five");

        concurrentHashMap.put(1, "One");
        concurrentHashMap.put(11, "eleven");
        concurrentHashMap.put(2, "Two");
        concurrentHashMap.put(3, "Three");
        concurrentHashMap.put(4, "Four");


        System.out.println(concurrentHashMap);
//        for (Map.Entry<Integer, String> set : concurrentHashMap.entrySet()) {
//            if(set.getKey()==3)concurrentHashMap.put(6,"New Added");
//        }
//
//        System.out.println(concurrentHashMap);


        System.out.println("This is the ConcurrentHashMap ....");

        Map<Integer, String> hashMap = new HashMap<>();


        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(0,"Zero");
        hashMap.put(5, "Five");
        hashMap.put(1, "One");
        System.out.println(hashMap);
        System.out.println("This is the HashMap ....");
//        for (Map.Entry<Integer, String> set : hashMap.entrySet()) {
//            if (set.getKey() == 4) hashMap.put(6, "Changed");
//        }
//        System.out.println(hashMap);


//
    }
}
