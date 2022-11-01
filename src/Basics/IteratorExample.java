package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ajitth");
        name.add("Abi");
        name.add("Akil");
        name.add("Akon");

        List<Integer> number = Arrays.asList(11, 23, 3, 22, 11, 4, 4, 9);

        Iterator<Integer>num=number.iterator();



        Iterator<String> nameAsList = name.iterator();
        System.out.println(name);
        System.out.println("**********************");
        System.out.println(nameAsList.hasNext());

        while (nameAsList.hasNext()) {
            if (nameAsList.next().equals("Ajith")) ;

        }


    }
}
