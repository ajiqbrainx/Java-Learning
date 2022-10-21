package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(5);
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(0);
        number.add(9);
        number.add(3);
        number.add(4);
        System.out.println(number);

    }
}
