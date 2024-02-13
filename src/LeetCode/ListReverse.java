package LeetCode;

import java.util.*;

public class ListReverse {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


//        int temp = list.get(list.size() - 1);
//        int first = list.get(0);
//        rotate(list, 2, temp, first);

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                list.set(j, i);


            }

        }


    }

//    static List rotate(LinkedList<Integer> list, int input, int temp, int first) {
//        if (input >= 0) {
//            list.set(list.size() - 1, first);
//            list.set(0, temp);
//            System.out.println(list);
//            return rotate(list, input - 1, list.get(list.size() - 1), list.get(0));
//        } else return list;
//
//
//    }
}
