package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] array = {10,20,30,40,50};
        var output = rotateArray(array, 2, array.length - 1,0);
        System.out.println(Arrays.toString(output));

    }

    static int[] rotateArray(int[] array, int input, int lastValue,int nextValue) {

        if (input > 0) {
            int index = 1;
            int temp = array[0];
            array[0] = array[lastValue];

            for (int i = 1; i < array.length ; i++) {
                nextValue = array[i];
                array[index] = temp;
                temp = nextValue;
                index++;
            }
            return rotateArray(array, input - 1, array.length - 1,0);
        } else {
            return array;
        }

    }
}
