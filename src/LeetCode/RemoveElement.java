package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] array = new int[nums.length];

        int output = 0;

        for (int i = 0; i < nums.length; i++) {

            if (val != nums[i]) {
                array[i] = nums[i];
            } else {
                output++;
                array[i] = '_';
            }
        }
        Arrays.sort(array);
        System.out.println(output);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
