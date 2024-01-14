package Practice;

import java.util.ArrayList;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] array = {7, 1, 890, 6, 9, 8};
        int high = 0;
        int output = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > high) {
                high = array[i];
            }
        }
        System.out.println(high);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != high) {
                if (array[i] > output) {
                    output = array[i];
                }
            }
        }
        System.out.println(output);



    }
}
