package Basics;

import java.util.Arrays;

public class ArrayBigElement {
    public static void main(String[] args) {

        int[] array = {9, 2, 3, 5, 5};

        int temp;

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (array[i] > array[j]) {

                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }

        long output = 0;
        for (int i = 0; i < array.length; i++) {
            output = (output * 10) + array[i];
        }

        System.out.println(Arrays.toString(array));

        System.out.println(output);


    }
}
