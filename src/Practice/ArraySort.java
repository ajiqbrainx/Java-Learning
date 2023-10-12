package Practice;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = {2, 1, 33, 55, 3, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        int swap;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }
}
