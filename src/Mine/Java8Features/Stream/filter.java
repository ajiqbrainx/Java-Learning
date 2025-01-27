package Mine.Java8Features.Stream;

import java.util.Arrays;
import java.util.List;

public class filter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                System.out.println(list.get(i) + " its a even number");
//            } else {
//                System.out.println(list.get(i) + " its a odd number");
//            }
//        }
//
        list.stream()
                .filter(f -> f % 2 == 0)
                .forEach(System.out::println);
        list.forEach(number -> {
                    if (number % 2 == 0) {
                        System.out.println(number + " its a even number");
                    } else {
                        System.out.println(number + " its a odd number");
                    }
                }
        );

    }
}
