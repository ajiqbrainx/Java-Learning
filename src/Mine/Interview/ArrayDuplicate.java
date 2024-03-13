package Mine.Interview;

import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 1, 2, 4, 5, 4, 5};
        int[] removeArray = new int[array.length];

        int index = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            boolean duplicate = false;
            for (int j = 0; j <= removeArray.length - 1; j++) {
                if (array[i] == removeArray[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                removeArray[index] = array[i];
                index++;
            }

        }
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < index; i++) {
            System.out.print(removeArray[i] + " ");
        }
    }
}
