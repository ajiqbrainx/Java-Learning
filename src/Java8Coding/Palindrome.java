package Java8Coding;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        String name = "madams";
        System.out.println(name);

        var ss = Arrays.stream(name.split("")).map(f -> new StringBuilder(f).reverse().toString()).reduce("", (partialString, element) -> partialString + element);

        System.out.println(ss);
//
//     var out=   Arrays.stream(name.split("")).map(f->new StringBuffer(f).reverse()).toString();
//
//        System.out.println(out.toString());
//       String output= Arrays.stream(name.split("")).map(f->new StringBuilder(f).reverse()).collect(Collectors.joining());
//
//
//        System.out.println(output);


    }
}
