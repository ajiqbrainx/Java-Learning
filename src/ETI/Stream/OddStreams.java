package ETI.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddStreams {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        var oddList = list.stream().filter(f -> f % 2 == 0).collect(Collectors.toList());
        System.out.println(oddList);

        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(f -> System.out.print(f + " "));


    }
}
