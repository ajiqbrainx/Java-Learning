package Guest;

import java.util.stream.IntStream;

class Thread1 implements Runnable {

    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(f -> System.out.print(f + " "));
    }
}

class Thread2 implements Runnable {

    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(f -> System.out.print(-f + " "));

    }
}

public class ThreadExample {
    public static void main(String[] args) {


        Thread1 thread1 = new Thread1();
        thread1.run();
        Thread2 thread2 = new Thread2();
        thread2.run();


    }
}
