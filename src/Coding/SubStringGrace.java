package Coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringGrace {
    public static void main(String[] args) {
        String[] array = {"sad", "sa", "sadl"};

        Map<Integer, List<String>> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int k = 0; k < array.length; k++) {
            String first = array[k];
            for (int i = 0; i < first.length(); i++) {
                for (int j = i; j < first.length(); j++) {
                    stringBuilder.append(first.charAt(j));
                    list.add(stringBuilder.toString());
                }
                stringBuilder.setLength(0);
            }
            map.put(k, list);
            list.clear();

        }
        System.out.println(map);
    }

    static  Map<Integer, List<String>> map(Map<Integer, List<String>> map,StringBuilder stringBuilder, List<String> list){

    }




//        int lessvalue = array[0].length();
//        String subString = "";
//
//        for (int i = 0; i < array.length; i++) {
//            if (lessvalue > array[i].length()) {
//                lessvalue = array[i].length();
//                subString = array[i];
//            }
//
//        }
//
//        boolean isPresent = true;
//
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].contains(subString)) {
//                isPresent = false;
//                break;
//            }
//        }
//
//        System.out.println(isPresent + " " + subString);


//    }
}
