package Java8Coding;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class NonNull {
    public static void main(String[] args) {

        Stream<String> ss = Stream.of("Ajith");


//        List name = Arrays.asList("Ajith", null, "Ashok", null);
//
//        List<String> sort = name.stream()
//                .filter(Objects::nonNull);

    }
}
