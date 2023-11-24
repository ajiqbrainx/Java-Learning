package LeetCode;

public class FindIndex {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                output = i;
                break;
            }
        }

        System.out.println(output);
    }
}
