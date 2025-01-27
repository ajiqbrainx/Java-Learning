package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<Integer> odd = number -> number % 2 == 0;

        Boolean output = odd.test(4);

        System.out.println(output);


    }


}
