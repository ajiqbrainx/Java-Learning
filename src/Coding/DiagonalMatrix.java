package Coding;

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int first = 0;
        int second = 0;

        int output=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                first = first + array[i][j];
                break;
            }
        }
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                second = second + array[i][j];
                break;
            }
        }
        System.out.println(first);
        System.out.println(second);

        output=first-second;
        System.out.println(output);
    }
}
