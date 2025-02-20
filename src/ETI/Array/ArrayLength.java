package ETI.Array;

import Mine.Practice.StringNew;

import java.util.Arrays;
import java.util.List;

public class ArrayLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("");

       var output= list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(output);
//
//        int output = 0;
//        for (String name : list) {
//            output = name.length() > output ? name.length() : output;
//        }
//
//
//        System.out.println(output);
    }
}
