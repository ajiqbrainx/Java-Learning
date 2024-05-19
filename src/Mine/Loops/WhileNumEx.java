package Mine.Loops;

import java.util.Scanner;

public class WhileNumEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter go or stop ");
        String stop = scanner.next();
        int i = 0;

        while (!stop.equals("stop")) {
            System.out.println(i);
            i++;
            System.out.println("Enter go or stop ");
            stop = scanner.next();
        }
        System.out.println("Your program has been stopped....");

    }
}
