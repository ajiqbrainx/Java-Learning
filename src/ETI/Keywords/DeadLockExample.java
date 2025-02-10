package ETI.Keywords;

public class DeadLockExample {
    public static void main(String[] args) {
        final Object one = new Object();
        final Object two = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (one) {
                System.out.println("Thread 1 Locked object 1");

                try {
                    Thread.sleep(1000);
                } catch (Exception exception) {
                    exception.fillInStackTrace();
                }
                synchronized (two) {
                    System.out.println("Thread 1 Locked object 2");
                }

            }

        }

        );

        Thread thread2 = new Thread(() -> {
            synchronized (two) {
                System.out.println("Thread 2 Locked object 2");

                try {
                    Thread.sleep(1000);
                } catch (Exception exception) {
                    exception.fillInStackTrace();
                }
                synchronized (one) {
                    System.out.println("Thread 2 Locked object 1");
                }

            }

        }

        );

        thread1.start();
        thread2.start();
    }
}
