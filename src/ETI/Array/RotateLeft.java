package ETI.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
//        2 3 4 5 1
        int rotation = 2;


        Arrays.stream(array).forEach(f -> System.out.print(f + " "));

        for (int j = 0; j < rotation; j++) {
            int firsElement = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = firsElement;
        }




        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }
}
