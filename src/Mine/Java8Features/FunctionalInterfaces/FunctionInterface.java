package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        Function<String,String> name = yourname -> "yourname is "+yourname;

       String yourName= name.apply("Ajith");

        System.out.println(yourName);
    }
}
