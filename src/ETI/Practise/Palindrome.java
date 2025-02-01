package ETI.Practise;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

//        give number or give string is the palindrome
        String name = "zootooz";

//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = name.length() - 1; i >= 0; i--) {
//            stringBuilder.append(name.charAt(i));
//        }
//        System.out.println(stringBuilder);
//
//        var ispresent = stringBuilder.toString().equals(name) ? "true" : "false";
//        System.out.println(ispresent);


        IntStream.rangeClosed(1, 4)
                .forEach(System.out::println);
        System.out.println();
        IntStream.range(1, 4)
//                .map(f -> f * f)
                .forEach(System.out::println);

        IntStream.rangeClosed(1, 10)
                .filter(f -> f % 2 != 0)
                .forEach(System.out::println);

//                .mapToObj(f -> String.valueOf(name.charAt(name.length() - f)))
//                .forEach(System.out::println);

//        System.out.println(output);
//        var print = output.equals(name) ? "Its palindrome" : "Its not a palindrom";
//        System.out.println(print);


//        121  integer palindrome check
        int number = 1112111;
        int lastCheck = number;

        int lastNumber;
        int reverse = 0;
        while (number > 0) {
            lastNumber = number % 10;
            reverse = (reverse * 10) + lastNumber;
            number = number / 10;

        }
        System.out.println(lastCheck);
        System.out.println(reverse);
        var output = lastCheck == reverse ? "Its is palindrome " : "Its not a palindrome";
        System.out.println(output);


    }
}
