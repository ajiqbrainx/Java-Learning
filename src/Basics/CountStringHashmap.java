package Basics;

import InterviewPractice.HashMapSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountStringHashmap {
    public static void main(String[] args) {

        String str = "This this is is done by Saket Saket";

        HashMap<String, Integer> map = new HashMap<>();

        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {


            if (map.containsKey(array[i])) {
                for (Map.Entry<String, Integer> value : map.entrySet()) {
                    map.put(array[i], value.getValue() + 1);
                    break;
                }
            } else {
                map.put(array[i], 1);
            }


        }
        System.out.println(map);
    }

}
