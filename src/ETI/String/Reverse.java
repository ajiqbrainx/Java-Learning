package ETI.String;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {

        String name = "mam";

        String output = IntStream.range(0, name.length())
                .mapToObj(f -> String.valueOf(name.charAt(name.length() - 1 - f)))
                .collect(Collectors.joining());
        System.out.println(output);
        var sss = name.equals(output) ? "Its is palindrom " : "Its not a palindrome";
        System.out.printf(sss);
    }
}
