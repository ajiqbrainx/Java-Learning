package Mine.Java8Features.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<String> input = ()-> "Its printing";

        System.out.println(input.get());
    }
}
