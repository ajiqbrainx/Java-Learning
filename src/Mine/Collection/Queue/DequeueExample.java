package Mine.Collection.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer>number=new LinkedList<>();

        number.add(1);
        number.add(22);
        number.add(32);

        number.poll();  //Means remove head of the element
        System.out.println(number);
        number.addLast(29);
        number.addFirst(1);
        System.out.println(number);

        Deque<String>name=new LinkedList<>();
        name.add("Element 1 (Head)");
        System.out.println(name);

        }

    }

