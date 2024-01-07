package LeetCode;

public class IncreasingTripelts {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,15,13};
        boolean output = false;

        int check = 0;
        int previous = 0;
        for (int i = 0; i < nums.length; i++) {
                if (previous < nums[i]) {
                    check++;
                    if (check == 3) {
                        output = true;
                        break;
                    }
                } else {
                    check = 1;
                }
                previous = nums[i];
        }
        System.out.println(output);

    }
}
