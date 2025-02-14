package ETI.LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 11, 7};
        int target = 9;

        System.out.println(Arrays.toString(fourSum(nums, target)));
    }

    static int[] fourSum(int[] nums, int target) {
        int[] output = new int[2];

        if (nums.length < 1) {
            return output;
        } else {

            for (int i = 0; i < nums.length; i++) {

                for (int j = i + 1; j < nums.length; j++) {

                    int count = nums[i] + nums[j];

                    var check = count == target;

                    if (check) {
                        output[0] = i;
                        output[1] = j;
                        break;
                    }


                }

            }


        }

        return output;
    }
}
