package Collection.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        queue.add(1);
        queue.add(2);

        System.out.println(queue);
        queue.poll();   //First in First out ...It will be working..
        System.out.println(queue);
    }
}
