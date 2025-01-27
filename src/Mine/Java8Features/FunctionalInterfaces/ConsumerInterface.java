package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        Consumer<String> myName = name -> System.out.println("yourname is "+ name);
//        Consumer<String> myNames = name ->  name;
        myName.accept("Ajith");

    }
}
