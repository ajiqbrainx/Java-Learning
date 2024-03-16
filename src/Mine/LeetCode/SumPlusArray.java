package Mine.LeetCode;

import java.util.*;
import java.util.function.DoubleUnaryOperator;

public class SumPlusArray {
    public static void main(String[] args) {

        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};

        long sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = (sum * 10) + digits[i];
        }
        sum = sum + 1;
        System.out.println(sum);
        long rem;
        List<Long> list = new ArrayList<>();

        while (sum > 0) {
            rem = sum % 10;
            list.add(rem);
            sum = sum / 10;
        }
        Collections.reverse(list);
        int output[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i]= Math.toIntExact(list.get(i));
        }

        System.out.println(Arrays.toString(output));


    }
}
