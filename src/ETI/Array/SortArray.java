package ETI.Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int array[] = {1, 22, 332, 13, 4, 5};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();
        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                if (array[i] > array[j]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j]=temp;
                }


            }
        }
        Arrays.stream(array).forEach(System.out::println);
    }
}
