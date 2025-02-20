package ETI.Array;

import Mine.Practice.StringNew;

import java.util.Arrays;
import java.util.List;

public class ArrayLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hello", "to", "java", "world");
        int output = 0;
        for (String name : list) {
//            output = name.length() > output ? name.length() : output;
            output = Math.max(name.length(), output);
        }


        System.out.println(output);
    }
}
