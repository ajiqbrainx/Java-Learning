package LeetCode;


import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] nums1 = {11, 22};
        int[] nums2 = {44};


        int length = nums1.length + nums2.length;
        int[] newArray = new int[length];


        for (int i = 0; i < nums1.length; i++) {
            newArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArray[nums1.length + i] = nums2[i];
        }

        Arrays.sort(newArray);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        if (newArray.length % 2 == 0) {
            int index = newArray.length / 2;
            int value = newArray[index - 1] + newArray[index];
            double ans = (double) value / 2;
            System.out.println(ans);
            System.out.println("yes");
//            return ans;
        } else {
            int index = (newArray.length - 1) / 2;
            int value = newArray[index];
            double ans = value;
            System.out.println(ans);
            System.out.println("no");
//            return ans;
        }


    }
}
