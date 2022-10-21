package Collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> number = new LinkedHashSet<>();
        number.add(332);
        number.add(1);
        number.add(20);
        number.add(11);
        number.add(22);
        number.add(33);
        System.out.println(number);
    }
}
