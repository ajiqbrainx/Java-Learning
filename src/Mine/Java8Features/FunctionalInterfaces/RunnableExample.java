package Mine.Java8Features.FunctionalInterfaces;

class Ajith implements Runnable{

    @Override
    public void run() {
        System.out.println("It is running");
    }
}

public class RunnableExample {

    public static void main(String[] args) throws InterruptedException {

        Thread aji =new Thread(new Ajith());
        aji.start();
        aji.join();
    }
}
