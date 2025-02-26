package ETI.Stream;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 3, 4, 5, 1, 4, 5);

        var output = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(f -> f.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(output);


//        Using Set to identify the Duplicates in List
        Set<Integer> emptySet = new HashSet<>();

        var setUsingDuplicates = list.stream()
                .filter(f -> !emptySet.add(f))
                .collect(Collectors.toSet());

        System.out.println("setUsingDuplicates " + setUsingDuplicates);


    }
}
