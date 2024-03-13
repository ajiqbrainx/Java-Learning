package Mine.HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279);

        miniMaxSum(a);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        System.out.println(arr);
        long minimumSum = 0;
        long maxmumSum = 0;


        for (int i = 0; i < arr.size() - 1; i++) {
            minimumSum = minimumSum + arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            maxmumSum = maxmumSum + arr.get(i);
        }
        System.out.println(minimumSum + " " + maxmumSum);

    }
}
