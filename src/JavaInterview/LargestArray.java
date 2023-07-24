package JavaInterview;

public class LargestArray {
    public static void main(String[] args) {
        int[] a = {1, 23, 49, 6, 4, 3};
        int largestNumber = 0;
        int secondLargest = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (secondLargest <= largestNumber) {

                if (largestNumber <= a[i]) {
                    largestNumber = a[i];
                }
            }


        }

        System.out.println(largestNumber);
        System.out.println(secondLargest);
    }
}
