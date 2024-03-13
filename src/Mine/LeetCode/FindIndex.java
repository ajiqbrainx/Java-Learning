package LeetCode;

import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        int[] nums = {7,8,9};
        int [] y={7,7,7};
        System.out.println(Arrays.compare(nums,y)+" "+Arrays.mismatch(nums,y));
//        int target = 2;
//        int output = 0;
//        boolean targetIsPresent = false;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (target == nums[i]) {
//                output = i;
//                targetIsPresent = true;
//                break;
//            }
//        }
//
//        if (targetIsPresent) {
//            System.out.println(output);
//        } else {
//            System.out.println("It is not there");
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] < target) {
//                    output = i + 1;
//                } else {
//                    break;
//                }
//            }
//            System.out.println(output);
//        }

    }
}
