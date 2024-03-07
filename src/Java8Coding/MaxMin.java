package Java8Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 22, 33, 455, 67, 88, 90);

        long minn = list.stream().min(Comparator.naturalOrder()).get();

        System.out.println(minn);
        int maxx = list.stream().max(Integer::compare).get();

        int min = list.stream().min(Integer::compare).get();
        System.out.println(maxx);
        System.out.println(min);
    }
}
