package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};



        generatePermutations(nums,0);


//        List<List<Integer>> output = new ArrayList<>();
//        List<Integer> single = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int index = nums[i];
//
//            for (int j = 0; j < nums.length; j++) {
//
//
//
//            }
//            single.add(nums[i]);
//
//
//        }
//        output.add(single);
//        System.out.println(output);

    }
    private static void generatePermutations(int[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = currentIndex; i < array.length; i++) {
            int temp = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = temp;
            generatePermutations(array, currentIndex + 1);
            temp = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = temp;
        }
    }

}
