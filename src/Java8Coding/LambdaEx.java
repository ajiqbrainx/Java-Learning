package Java8Coding;


import java.util.Arrays;
import java.util.List;

public class LambdaEx {
    public static void main(String[] args) {

        List<Integer> listValues = Arrays.asList(1, 2, 3, 4, 5, 6, 3);
        listValues.stream().filter(f -> f.equals(3)).forEach(f -> System.out.println("Number " + f + " is present"));
        listValues.stream().forEach(System.out::println);

        Runnable runnable = () -> listValues.stream().forEach(System.out::println);
        runnable.run();

    }
}
