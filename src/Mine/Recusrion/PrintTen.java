package Mine.Recusrion;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintTen {
    public static void main(String[] args) {

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
        var output = Arrays.asList(1, 2, 3);

        System.out.println(output);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HowMuch time to print");
        int destination = scanner.nextInt();
        System.out.println("Set the initial time ");
        int start = scanner.nextInt();
        printTenNumbers(100, 50);

    }

    static void printTenNumbers(int destination, int start) {
//
        if (start <= destination) {
            System.out.println(start);
            printTenNumbers(destination, start + 1);
        } else {
            System.out.println("Done...");
        }

    }
}
