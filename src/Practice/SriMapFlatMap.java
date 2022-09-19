package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SriMapFlatMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

//        map
        List<Integer> list1 = list.stream().map(f -> f * f).collect(Collectors.toList());
//        list1.forEach(System.out::println);
        System.out.println(list1);

//      flatMap
        List<Integer> list2 = list.stream().flatMap(f -> Stream.of(f * f, f + f)).collect(Collectors.toList());
        System.out.println(list2);

        List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> listofAll= listOfList.stream().flatMap(f -> f.stream()).collect(Collectors.toList());

        System.out.println(listofAll);
    }
}
