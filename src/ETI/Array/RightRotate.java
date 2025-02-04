package ETI.Array;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50, 60};
        int rotation = 2;
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));

        for (int i = 1; i <= rotation; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = last;

        }
        System.out.println();
        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
    }
}
