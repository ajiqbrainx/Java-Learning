package ETI.String;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Ajith";

        String reverse = IntStream.range(1, name.length() + 1)
                .mapToObj(f -> String.valueOf(name.charAt(name.length() - f)))
                .collect(Collectors.joining());

        System.out.println(reverse);
    }
}
