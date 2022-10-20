package Collection.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<>();
//        It is similar to ArrayList,But is "Synchronized" and Manipulation is "slow"..
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println(number);
    }
}
