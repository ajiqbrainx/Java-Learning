package Mine.LeetCode;

import java.util.*;

public class ClosestTarget {
    public static void main(String[] args) {

        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;

        int[] sortedArray = new int[nums.length];

        System.arraycopy(nums, 0, sortedArray, 0, nums.length);

        int output = 0;
        int n = sortedArray.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        boolean targetIsPresent = false;


        int firstElement = sortedArray[0];
        int lastElement = sortedArray[nums.length - 1];

        if (firstElement == target || lastElement == target) {
            for (int i = 0; i < 3; i++) {
                output += sortedArray[i];
            }
            System.out.println(output);
        } else {
            for (int i = 0; i < sortedArray.length; i++) {
                if (target == sortedArray[i]) {
                    int first = sortedArray[i - 1];
                    int last = sortedArray[i + 1];
                    output = first + target + last;
                    targetIsPresent = true;
                }

            }
        }


        if (!targetIsPresent) {

            if (firstElement > target) {
                for (int i = 0; i < 3; i++) {
                    output += sortedArray[i];
                }
                System.out.println(output);
            } else if (lastElement < target) {
                int x = sortedArray.length;
                if (x >= 3) {
                    for (int i = x - 3; i < x; i++) {
                        output += sortedArray[i];
                    }
                }
                System.out.println(output);

            }
            else{
                for (int i = 0; i < 3; i++) {
                    output += sortedArray[i];
                }
//                output=target;
            }

        }
        System.out.println(output);


    }

}
