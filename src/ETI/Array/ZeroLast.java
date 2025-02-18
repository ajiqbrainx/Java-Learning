package ETI.Array;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {

        int[] array = {0,1, 2, 0, 3, 0, 0, 3, 5};

        Arrays.stream(array).forEach(f -> System.out.print(f + " "));


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }

}

