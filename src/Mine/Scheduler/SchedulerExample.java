package Mine.Scheduler;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExample {
    public static void main(String[] args) {
        // Create a scheduled executor service with a single thread
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        // Schedule a task to run after 5 seconds
        scheduler.schedule(() -> {
            System.out.println("Task 1: Hello, it's time!");
        }, 5, TimeUnit.SECONDS);

        // Schedule another task to run every 10 seconds after an initial delay of 10 seconds
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Task 2: Hello, it's time!");
        }, 10, 10, TimeUnit.SECONDS);
    }
}
