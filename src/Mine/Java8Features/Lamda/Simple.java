package Mine.Java8Features.Lamda;

import java.util.function.BiFunction;

public class Simple {
    public static void main(String[] args) {


//        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
//
//        int answer = sum.apply(1, 2);
//
//        System.out.println(answer);

        Calculator calc = (a, b) -> a + b;
        calc.sum(1, 2);
    }

    interface Calculator {
        int sum(int a, int b);
    }
}
