package Java8Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfArray {
    public static void main(String[] args) {
        String[] arr = {"aji", "abi", "Akil"};
        List<String> list= Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(list);


    }
}
