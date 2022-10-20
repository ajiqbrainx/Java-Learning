package Collection.List;

import java.util.*;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>(3);


        number.add(0, 23);
        number.add(1, 24);
        number.add(2, 25);
        number.add(3, 26);
        number.add(4, 27);


//        for (int i = 1; i <= 100; i++) {
//            number.add(i);
//        }

        System.out.println(number);
        System.out.println("Changes....");
        number.add(1,1000);
        System.out.println(number);

        List<Integer> list = new ArrayList<>(3);
        list.add(0, 23);
        list.add(1, 24);
        list.add(2, 25);
        list.add(3, 26);
        list.add(4, 27);

//
//        for (int i = 1; i <= 100; i+=2) {
//            list.add(i);
//        }
        System.out.println(list);
        System.out.println("Changes.....");
        list.add(1,1000);
        System.out.println(list);



    }
}
