package Mine.Coding;

import java.lang.reflect.Array;

public class OddEven {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) System.out.println("Odd");
            else System.out.println("Even");
        }

    }
}
