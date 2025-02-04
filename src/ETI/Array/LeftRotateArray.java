package ETI.Array;

import java.util.Arrays;
import java.util.List;

public class LeftRotateArray {
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50, 60};
//        30 , 40, 50, 60 ,10 ,20

        int rotation = 2;


        Arrays.stream(array).forEach(f -> System.out.print(f + " "));


        for (int j = 1; j <= rotation; j++) {

            int first = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = first;
        }
        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }


}
