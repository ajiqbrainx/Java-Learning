package Mine.MultiThread;

import java.util.Arrays;

class Odd extends Thread {

    public synchronized void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("odd" + i);
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Even extends Thread {

    public synchronized void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("even" + i);
        }
        notify();


    }
}


public class OddEven {
    public static void main(String[] args) throws InterruptedException {
        Odd odd = new Odd();


        Even even = new Even();

        odd.start();


//        System.out.println("odd...Done");

        even.start();
//        System.out.println("even...Done");



    }
}
