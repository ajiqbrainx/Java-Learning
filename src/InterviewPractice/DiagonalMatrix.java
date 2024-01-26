package InterviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows ");
        int row = scanner.nextInt();
        System.out.println("Enter the Columns ");
        int column = scanner.nextInt();

        int[][] array = new int[row][column];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter the number ");
                int number = scanner.nextInt();
                array[i][j] = number;
            }
        }
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum = sum + array[i][i];
        }
        System.out.println(sum);

    }
}
