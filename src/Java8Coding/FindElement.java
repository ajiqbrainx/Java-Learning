package Java8Coding;


import java.util.*;

public class FindElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 132);

        list.stream().map(f -> f.toString()).filter(f -> f.startsWith("1")).forEach(System.out::println);

    }
}
