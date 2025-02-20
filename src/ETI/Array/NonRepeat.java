package ETI.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class NonRepeat {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.stream(array).forEach(f->map.put(f, map.getOrDefault(f, 0) + 1));
        map.entrySet().stream().filter(f -> f.getValue() == 1).forEach(f -> System.out.print(f.getKey() + " , "));



        System.out.println(map);
        for (Integer number : array) {
//            if (!map.containsKey(number)) {
            map.put(number, map.getOrDefault(number, 0) + 1);
//            } else {
//                map.put(number, map.get(number) + 1);
//            }
        }
        System.out.println(map);
        map.entrySet().stream().filter(f -> f.getValue() == 1).forEach(f -> System.out.print(f.getKey() + " , "));


//        for (Map.Entry<Integer, Integer> ss : map.entrySet()) {
//            if (ss.getValue() == 1) {
//                System.out.println(ss.getKey());
//            }
//        }
    }
}
