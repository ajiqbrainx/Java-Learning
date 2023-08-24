package Java8Coding;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 55, 67, 89, 9);
        long count1 = list.stream().count();
        System.out.println(count1);
    }
}
