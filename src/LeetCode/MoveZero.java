package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
            if (nums[i] != 0) {
                list.add(nums[i]);
                nums[i]=nums[i];
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        System.out.println(Arrays.toString(nums));

    }
}
