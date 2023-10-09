package MultiThread;

class ThreadOne implements Runnable {   //Here this class act as a thread with the help of THREAD class

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("Adding sum values ");
        }

    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(i + " * " + 2 + " = " + i * 2);
        }
    }

}


public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        Runnable threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

//        threadOne.start();     //start method is used for we can start the thread
//
//        threadTwo.start();       //start method is used for we can start the thread
//
//      if(threadOne.isAlive()){    // isAlive method is specially thread is running or not we can track it
//          System.out.println("Yah its Living");
//      }
//
//        threadOne.join();   //The particular thread will be executed fully, and it will be done for other process
//        threadTwo.join();   //The particular thread will be executed fully, and it will be done for other process
//
//        if(!threadOne.isAlive()){
//            System.out.println("Yah its not Living");
//        }
//        System.out.println("End ....");
    }
}
