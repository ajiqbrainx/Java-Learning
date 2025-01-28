package Mine.Collection.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(3);
        number.add(2);
        number.add(1);
        System.out.println(number);
        number.poll();
        System.out.println(number);
    }
}
