package LeetCode;

import java.util.*;

public class TripeltsSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> integerList = new ArrayList<>();
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(nums[k]);
                        integerList.stream().sorted();
                        output.add(integerList);
                    }
                }
            }
        }
        Comparator<List<Integer>> listComparator = (list1, list2) -> {
            Collections.sort(list1);
            Collections.sort(list2);
            return list1.toString().compareTo(list2.toString());
        };

        Collections.sort(output, listComparator);

        Set<List<Integer>> uniqueOutputSet = new HashSet<>(output);
        List<List<Integer>> uniqueOutputList = new ArrayList<>(uniqueOutputSet);
        System.out.println(uniqueOutputList);
    }
}
