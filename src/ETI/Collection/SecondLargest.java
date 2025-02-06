package ETI.Collection;

import java.util.Arrays;
import java.util.stream.Stream;

public class SecondLargest {
    public static void main(String[] args) {

        int[] array = {10, 20, 33, 33, 8};



        int first = 0;
        int second = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                first = array[i];
            }
        }

        for (int num : array) {
            if (num != first && num > second) {
                second = num;
            }
        }

        System.out.println(second);
    }

}
