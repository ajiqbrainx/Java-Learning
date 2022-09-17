package Interview;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("12ad");
        list.add(12);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
//        list1.add("12");  // It is compile time error

        System.out.println(list);
        System.out.println(list1);
    }
}
