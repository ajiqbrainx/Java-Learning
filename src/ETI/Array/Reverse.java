package ETI.Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));


        for (int i = 0; i < array.length / 2 - 1; i++) {
            int first = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = first;
        }

        System.out.println();

        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }
}
