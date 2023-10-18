package LeetCode;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {

                        if (nums[i] + nums[j] + nums[k] +nums[l] == target) {
                            List<Integer> integerList = new ArrayList<>();
                            integerList.add(nums[i]);
                            integerList.add(nums[j]);
                            integerList.add(nums[k]);
                            integerList.add(nums[l]);
                            output.add(integerList);
                        }

                    }

                }
            }
        }


        Set<List<Integer>> uniqueSet = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        for (List<Integer> sublist : output) {
            if (uniqueSet.add(sublist)) {
                resultList.add(sublist);
            }
        }

        System.out.println(output);


    }
}
