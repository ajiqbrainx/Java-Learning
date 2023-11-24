package LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindElement {
    public static void main(String[] args) {

//

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int index = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(target);
        int output = (index != -1) ? index : -1;

        System.out.println(output);
//        int output = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                output = i;
//                break;
//            } else output = -1;
//        }
//
//        System.out.println(output);
    }

}
