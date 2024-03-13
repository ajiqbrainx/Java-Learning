package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3}, {2, 4}};

        List<Integer> output = new ArrayList<>();


        if (matrix.length == 1) {
            for (int i = 0; i < matrix[0].length; i++) {
                output.add(matrix[0][i]);
            }
        } else if (matrix.length == 2) {
            for (int i = 0; i < matrix[0].length; i++) {
                output.add(matrix[0][i]);
            }
            for (int i = matrix[1].length - 1; i >= 0; i--) {
                output.add(matrix[1][i]);
            }
        } else {
            int[] firstArray = matrix[0];
            for (int i = 0; i < firstArray.length; i++) {
                output.add(firstArray[i]);
            }


            int[] secondArray = matrix[1];
            int secondArrayLength = secondArray.length - 1;
            output.add(secondArray[secondArrayLength]);


            int[] thirdArray = matrix[2];
            for (int i = thirdArray.length - 1; i >= 0; i--) {
                output.add(thirdArray[i]);
            }

            for (int i = 0; i < secondArrayLength; i++) {
                output.add(secondArray[i]);
            }


        }

        System.out.println(output);


    }
}
