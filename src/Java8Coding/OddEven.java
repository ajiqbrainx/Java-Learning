package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> oddNumber = list.stream().filter(odd -> (odd % 2 != 0)).collect(Collectors.toList());
        List<Integer> evenNumber = list.stream().filter(even -> (even % 2 == 0)).collect(Collectors.toList());

        System.out.println("Odd number = "+oddNumber);
        System.out.println("Even Number = "+evenNumber);


    }
}
