package ETI.Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeat {
    static public void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2};
//        3,4

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        System.out.println(map);

        for (Map.Entry num : map.entrySet()) {

            if (num.getValue().equals(1)) {
                System.out.println(num.getKey());
            }

        }

//        List<Integer> numbers = new ArrayList<>();
//
//        List<Integer> nonRepeat = new ArrayList<>();
//        for (int number : array) {
//            if(!numbers.contains(number)){
//                numbers.add(number);
//            }else {
//                nonRepeat.add(number);
//            }
//
//        }


    }

}
