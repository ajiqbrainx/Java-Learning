package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesArray {
    public static void main(String[] args) {

        int[] nums = {1,1,2};

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueSet.add(num);
        }

        nums = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            nums[index++] = num;
        }

        int output = uniqueSet.size();
        System.out.println(output);
        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
