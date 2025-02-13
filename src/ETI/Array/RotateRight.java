package ETI.Array;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
//        right = {5,1,2,3,4}
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
        int rotate = 2;

        for (int i = 0; i < rotate; i++) {
            int lastElement = array[array.length - 1];
            for (int j = array.length -1 ; j > 0; j--) {
                array[j] = array[j -1];
            }
            array[0] = lastElement;
        }
        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));

    }
}
