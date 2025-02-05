package ETI.Keywords;

class SharedData {
     volatile boolean flag = false;  // No volatile keyword

    void updateFlag() {
        flag = true;  // Thread 1 updates the variable
        System.out.println("Flag updated to true");
    }

    void checkFlag() {
        int count = 0;
        while (!flag) {
            // Thread 2 keeps checking
            count++;
            System.out.println("It is count is" + count);
        }
        System.out.println("Flag detected as true");
    }
}

public class VolatileExample {

    public static void main(String[] args) {
        SharedData data = new SharedData();

        // Thread 1 updates the flag
        new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            data.updateFlag();
        }).start();

        // Thread 2 waits for the flag change
        new Thread(() -> data.checkFlag()).start();
    }
}
