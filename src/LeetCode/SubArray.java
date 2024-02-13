package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum = sum + array[j];
                list.add(sum);
            }
            sum = 0;
        }


        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
