package Loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWhile {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        var value = num.iterator();
        int temp = 0;
        while (value.hasNext()) {
            int nums = value.next();
            temp = temp + nums;
        }
        System.out.println(temp);
    }
}
