package Collection.List;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {
//        List<Integer> number=new ArrayList<Integer>();
//
//        number.add(0,33);
//        number.add(1,12);
//
//        System.out.println(number);
//        number.remove(1);
//        System.out.println(number);
//
//        List<String> name=new ArrayList<>;
//        name.add("Ajith");
//        name.add("Ashok");
//        System.out.println(name);
//
//        List<Object>any=new ArrayList<>();
//        any.add(23);
//        any.add("Ajith");
//        System.out.println(any);


        int a[] = new int[3];
        a[0] = 1;
        a[0] = 31;
//                {1, 2, 3, 4, 5};

        ArrayObject arrayObject[] = new ArrayObject[2];
        arrayObject[0] = new ArrayObject(1, "Ajith");
        arrayObject[1] = new ArrayObject(2, "Ashok");

//        System.out.println(arrayObject);
        for (int i = 0; i < arrayObject.length; i++) {


            System.out.println(arrayObject[i]);
        }
    }
}

class ArrayObject {

    int age;
    String name;

     ArrayObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

}
