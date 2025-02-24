package ETI.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SumOfArrayGivenNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 2};
        int sum = 3;

        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (sum == array[i] + array[j]) {
                    List<Integer>nested=new LinkedList<>();
                    nested.add(i);
                    nested.add(j);
                    list.add(nested);
                }
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i; j < array.length; j++) {
//
//            }
//        }

        System.out.println(list);
    }
}
