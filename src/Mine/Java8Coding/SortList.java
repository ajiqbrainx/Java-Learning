package Java8Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 1, 3, 2, 1);

        var ascendingOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);

        var descendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrder);


    }
}
