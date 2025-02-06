package ETI.Collection;

import java.util.LinkedList;
import java.util.stream.IntStream;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(100);
        linkedList.add(1000);
        linkedList.add(10000);
        linkedList.add(100000);


        linkedList.stream().mapToInt(integer -> integer)
                .forEach(f -> System.out.print(f + " "));


        System.out.println();
        IntStream.range(0, linkedList.size())
                .map(f -> linkedList.get(linkedList.size() - 1 - f))
                .forEach(f -> System.out.print(f + " "));


    }
}
