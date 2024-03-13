package Mine.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(23);
        linkedList.add(78);
        System.out.println(linkedList);
        linkedList.addFirst(2);
        linkedList.addLast(90);
        System.out.println(linkedList);

        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(1);
        arraylist.add(23);
        arraylist.add(78);
        System.out.println(arraylist);
        arraylist.add(23);
        System.out.println(arraylist);


    }
}
