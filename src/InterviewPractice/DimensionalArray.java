package InterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {
    public static void main(String[] args) {

        int rows = 2;
        int column = 2;
        Scanner scanner = new Scanner(System.in);


        int[][] array = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the value ");
                int value = scanner.nextInt();
                array[i][j] = value;
                System.out.println(array[i][j]);
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
