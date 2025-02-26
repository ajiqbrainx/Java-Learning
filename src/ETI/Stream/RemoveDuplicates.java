package ETI.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 2, 3, 4, 5, 1, 4, 5);

        System.out.println(list);
        var uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueList);

//        we can use set also

    }
}
