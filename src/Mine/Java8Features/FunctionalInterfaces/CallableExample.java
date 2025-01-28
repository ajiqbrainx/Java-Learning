package Mine.Java8Features.FunctionalInterfaces;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Aji implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("It's Running");
        return "ajith";
    }
}

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(new Aji());

        try {
            String result = future.get();
            System.out.println("Result from Callable: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
