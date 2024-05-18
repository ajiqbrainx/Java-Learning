package LeetCode;

import java.util.Arrays;

public class MissingPositive {
    public static void main(String[] args) {

        int[] nums = {44, 22, 33, 11};

        int output = 1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (output == nums[i]) {
                    output++;
                }
            }
        }
        System.out.println(output);
    }
}
