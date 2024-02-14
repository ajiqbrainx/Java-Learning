package Basics;

import java.util.Arrays;
import java.util.OptionalInt;

public class Matrix {
    public static void main(String[] args) {

//        int[][] array = {{1, 2}, {3, 4}};

        int[] array = {1, 2};
      OptionalInt ss=  Arrays.stream(array).min();

        System.out.println(ss);


//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array[i].length-1; j >= 0; j--) {
//                System.out.print(array[i][j] +" ");
//            }
//            System.out.println();
//        }



    }
}
