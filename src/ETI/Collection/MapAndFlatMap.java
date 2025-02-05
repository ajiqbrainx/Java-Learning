package ETI.Collection;

import java.util.*;
import java.util.stream.Stream;

public class MapAndFlatMap {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().map(f -> f == 2).forEach(f -> System.out.print(f + " "));
        System.out.println();
        list.stream().flatMap(f -> Stream.of(f, f * f)).forEach(f -> System.out.print(f + " "));

    }
}
