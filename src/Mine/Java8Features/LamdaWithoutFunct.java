package Java8Features;

import java.util.ArrayList;
import java.util.function.Consumer;


public class LamdaWithoutFunct {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(23);
        integers.add(24);
        integers.add(25);
        integers.add(26);

        Consumer<Integer> fun = (n) -> System.out.println(n);
        integers.forEach(fun);


    }
}
