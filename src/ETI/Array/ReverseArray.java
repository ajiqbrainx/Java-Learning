package ETI.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
        System.out.println();

        int arrayLength = array.length - 1;

        int actualLength = array.length;
        int lastValue = actualLength / 2;

        for (int i = 0; i < lastValue; i++) {
            int first = array[i];
            array[i] = array[arrayLength];
            array[arrayLength] = first;
            arrayLength = arrayLength - 1;
        }

        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }
}
