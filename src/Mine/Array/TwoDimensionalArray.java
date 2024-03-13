package Mine.Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int array[][] = {{1,2}, {3, 4}};

        int output = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                output = output + array[i][j];
                break;
            }
        }

        System.out.println(output);

    }
}
