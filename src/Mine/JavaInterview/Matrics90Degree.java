package JavaInterview;

import java.util.Scanner;

public class Matrics90Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows = ");
        int rows = scanner.nextInt();
        System.out.println("Enter the Columns = ");
        int columns = scanner.nextInt();

        int[][] matrics = new int[rows][columns];

        System.out.println("Enter the Matrices number = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrics[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Before matrices");

        for (int i = 0; i < matrics.length; i++) {

            for (int j = 0; j < matrics[i].length; j++) {
                System.out.print(matrics[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After matrices");
        for (int i = matrics.length - 1; i >= 0; i--) {
            for (int j = matrics[i].length - 1; j >= 0; j--) {
                System.out.print(matrics[i][j] +" ");
            }
            System.out.println();
        }

    }

}