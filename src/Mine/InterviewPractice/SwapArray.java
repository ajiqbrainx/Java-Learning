package InterviewPractice;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
        int firstIndex = array[0];
        int lastIndex = array[array.length - 1];

        array[0] = lastIndex;
        array[array.length - 1] = firstIndex;
        System.out.println(Arrays.toString(array));

    }
}
