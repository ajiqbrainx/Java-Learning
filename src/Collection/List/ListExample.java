package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(89);
        list.add(90);
        list.add(34);
        list.add(23);

//        list.forEach(System.out::println);
        List<Integer> fail = list.stream().filter(number -> number < 50).collect(Collectors.toList());
        System.out.println(fail);

    }
}
