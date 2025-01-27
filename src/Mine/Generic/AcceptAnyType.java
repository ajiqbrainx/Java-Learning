package Mine.Generic;

import java.util.List;

class PrintClass {
    void printAnyType(List<?> value) {
        value.forEach(System.out::println);
    }

    void printInt(List<Integer> value) {
        value.forEach(System.out::println);
    }

    <T> void printAnyType(T value) {
        System.out.println(value);
    }
}

public class AcceptAnyType {
    public static void main(String[] args) {

        PrintClass printClass = new PrintClass();
        printClass.printAnyType(List.of(1, 2, "Ajith"));
        printClass.printInt(List.of(1, 2));

        printClass.printAnyType("Ajith");
    }
}
