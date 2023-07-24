package JavaInterview;

public class DeadLock {

    static Object object1 = new Object();

    static Object object2 = new Object();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            synchronized (object1) {
                System.out.println("Thread is 1 hold 1");
            }
            synchronized (object2) {
                System.out.println("Thread is 1 Hold 2");
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (object2) {
                System.out.println("Thread is 2 hold 1");
            }
            synchronized (object1) {
                System.out.println("Thread is 2 Hold 2");
            }
        });
        thread1.start();
        thread2.start();

    }
}
