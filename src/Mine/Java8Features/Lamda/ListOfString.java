package Mine.Java8Features.Lamda;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfString {
    public static void main(String[] args) {
        List<String> list = List.of("Ajith", "Abi", "Sanus");
        System.out.println(list);

        var print = list.stream().filter(f -> f.startsWith("A")).collect(Collectors.toList());
        System.out.println(print);
    }

}
