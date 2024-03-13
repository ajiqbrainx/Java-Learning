package LeetCode;

import java.lang.reflect.Array;
import java.nio.channels.OverlappingFileLockException;
import java.util.Vector;

public class VectorSum {
    public static void main(String[] args) {

        int[] nums = {3, 2, 4};


        int target = 6;
        int[] print = new int[2];

        for (int i = 0; i <=nums.length - 1; i++) {
            for (int j =i+ 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    print[0] = i;
                    print[1] = j;
                }
            }
        }


        System.out.println(print[0] +""+print[1]);
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int[] print = new int[2];

            for (int i = 0; i <=nums.length - 1; i++) {
                for (int j =i+ 1; j <= nums.length - 1; j++) {
                    if (nums[i] + nums[j] == target) {
                        print[0] = i;
                        print[1] = j;
                    }
                }
            }
            return print;

        }
    }
}
