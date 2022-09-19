package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 56, 34, 56, 67, 89, 90);
        list.stream().filter(f -> (f % 2 == 0)).forEach(System.out::print );

//        List<Integer> even = list.stream().filter(f -> (f % 2 == 0)).collect(Collectors.toList());
//
//        System.out.println(even);
//
//        List<Integer> odd = list.stream().filter(f -> (f % 2 != 0)).collect(Collectors.toList());
//        System.out.println(odd);

    }
}
