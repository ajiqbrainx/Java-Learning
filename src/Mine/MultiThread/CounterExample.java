package Mine.MultiThread;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

class MyThread implements Runnable {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter.increment();
        }
    }
}

public class CounterExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

//        Thread thread1 = new Thread(new MyThread(counter));
//        Thread thread2 = new Thread(new MyThread(counter));
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();

        MyThread task1 = new MyThread(counter);
        task1.run();

        MyThread task2 = new MyThread(counter);
        task2.run();


        System.out.println("Final count: " + counter.getCount());
    }
}