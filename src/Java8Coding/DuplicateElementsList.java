package Java8Coding;


import java.util.HashSet;
import java.util.List;

import java.util.Arrays;
import java.util.Set;

public class DuplicateElementsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 78, 8, 9,1);
        Set<Integer> set = new HashSet();
        list.stream().filter(f -> !set.add(f)).forEach(System.out::println);

    }
}
