package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {
        UnaryOperator<Integer> sum = num -> num + 1;
        int output = sum.apply(2);
        System.out.println(output);

    }
}
