package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {
    public static void main(String[] args) {

//        same input and same output type
        BinaryOperator<Integer> add = (num1, num2) -> num1 + num2;
        int output = add.apply(1, 2);

        System.out.println(output);


//        we can modify here input and output style in
        BiFunction<String, Integer, String> myNameAndAge = (name, age) -> "your Name is " + name + " and your Age is " + age;

        var output1 = myNameAndAge.apply("Ajith", 26);
        System.out.println(output1);
    }
}
