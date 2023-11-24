package LeetCode;

import java.util.Arrays;

public class FindTwoElement {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7,8,8, 9,10};
        int target = 9;
        int[] output = new int[2];
        output[0] = -1;
        output[1] = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (index == 0) {
                    output[index] = i;
                    output[index + 1] = i;
                    index++;
                } else {
                    output[index] = i;
                }
            }
        }


        for (Integer num : output) {
            System.out.println(num);
        }

    }
}
