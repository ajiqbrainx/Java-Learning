package Java8Coding;

import java.util.Arrays;
import java.util.ListResourceBundle;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 22, 33, 455, 67, 88, 90);
        int maxx= list.stream().max(Integer::compare).get();
        System.out.println(maxx);
    }
}
