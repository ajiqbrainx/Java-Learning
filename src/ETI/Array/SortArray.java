package ETI.Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int array[] = {10, 2, 3, 1, 33, 0,2,23,1,0};
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));


        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int firstElement = array[i];
                    array[i] = array[j];
                    array[j] = firstElement;
                }
            }
        }
        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));

    }
}
