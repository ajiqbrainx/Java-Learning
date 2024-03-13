package JavaInterview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1);

        System.out.println("It's list");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("It's a linked list");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }


    }
}
