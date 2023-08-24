package JavaInterview;

public class SecondLargestArray {

    private static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int[] a = {1, 233, 49, 6, 4, 3};
        findSecondHighest(a);

        System.out.println(findSecondHighest(a));
//        System.out.println(secondLargest);
    }
}
