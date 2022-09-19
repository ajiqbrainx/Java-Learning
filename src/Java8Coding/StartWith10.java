package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class StartWith10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 12, 19, 34, 23, 56, 98, 17);
        list.stream()
                .map(f -> f + "") //Convert Integer to String ......
                .filter(f -> f.startsWith("1"))
                .forEach(System.out::println);


    }
}
