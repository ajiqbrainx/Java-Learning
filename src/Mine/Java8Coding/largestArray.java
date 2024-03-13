package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class largestArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println(min.get());
        System.out.println(max.get());


        System.out.println(Arrays.stream(a).max().getAsInt());
        System.out.println(Arrays.stream(a).min().getAsInt());


    }
}
