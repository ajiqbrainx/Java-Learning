package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesArray {
    public static void main(String[] args) {

        int[] nums = {-3,-1,0,0,0,3,3};
        Arrays.sort(nums);

        Set<Integer> set = new LinkedHashSet<>();

        for (int value : nums) {
            set.add(value);
        }
//        Arrays.sort(set.toArray());
        System.out.println(set);

        int output = 0;
        Integer[] array = set.toArray(new Integer[0]);

        for (int i = 0; i < set.size(); i++) {
            nums[i] = array[i];
            output++;
        }
        System.out.println(output);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +" ");
        }


//        Set<Integer> uniqueSet = new LinkedHashSet<>();
//        for (int num : nums) {
//            uniqueSet.add(num);
//        }

//        int output = uniqueSet.size();
//
//
//        nums = new int[uniqueSet.size()];
//        int index = 0;
//        for (int num : uniqueSet) {
//            nums[index++] = num;
//        }
//
//
//        System.out.println(output);
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }


    }
}
