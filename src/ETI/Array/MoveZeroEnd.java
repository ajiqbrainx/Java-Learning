package ETI.Array;

import java.util.Arrays;

public class MoveZeroEnd {
    public static void main(String[] args) {

        int array[] = {0, 2, 0, 23, 0, 4, 0, 22};
//        101 , 2 ,23 ,4, 22 ,0 , 0, 0

        Arrays.stream(array).forEach(f-> System.out.print(f+" "));

        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {
                if (array[i] == 0) {
                    int zero = array[i];
                    array[i] = array [j];
                    array[j] =zero;
                }
            }

        }
        System.out.println();
        Arrays.stream(array).forEach(f-> System.out.print(f+" "));
    }
}
