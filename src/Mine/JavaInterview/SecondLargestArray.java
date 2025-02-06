package Mine.JavaInterview;

public class SecondLargestArray {

    private static int findSecondHighest(int[] array) {
        int highest = 0;
        int secondHighest = 0;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest ) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
    public static void main(String[] args) {
        int[] a = {100, 233, 49, 6, 4, 223};
        findSecondHighest(a);

        System.out.println(findSecondHighest(a));
//        System.out.println(secondLargest);
    }
}
