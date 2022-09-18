package Java8Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> number1 = new ArrayList<>();
        number1.add(Arrays.asList(1, 2));
        number1.add(Arrays.asList(3, 4));
        number1.add(Arrays.asList(5, 6));
        List<Integer> number = Arrays.asList(1, 22, 45, 67, 78, 90);
//Filter Example.....
        List<Integer> lessthanThree = number.stream().filter(f -> (f < 3)).collect(Collectors.toList());
        System.out.println(lessthanThree);

//       Map Exaple
        List<Integer> square = number.stream().map(f -> f * f).collect(Collectors.toList());
        System.out.println(square);

        List<Integer> square1 = number.stream().flatMap(f -> Stream.of(f * f)).collect(Collectors.toList());
        System.out.println(square1);

//Flatmap....Flatting
        List<Integer> flatmap = number1.stream()
                .flatMap(f -> f.stream())
                .collect(Collectors.toList());
        System.out.println(flatmap);

// Flatmap .....one to many operation....
        List<Integer> flatter = flatmap.stream().flatMap(f -> Stream.of(f, f * f, f * f * f)).collect(Collectors.toList());
        System.out.println(flatter);



    }
}
