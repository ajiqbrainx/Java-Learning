package LeetCode;

import java.awt.*;
import java.util.Arrays;

public class RotateImage {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        int length = matrix.length;
        int[][] output = new int[length][length];

        matrix =output;

        int row = 0;
        int column = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                int value = matrix[j][i];
                output[row][column] = value;
                column++;
            }
            column = 0;
            row++;
        }
        matrix =output;
        System.out.println(Arrays.toString(matrix));

    }


}
