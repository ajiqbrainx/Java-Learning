package Mine.Practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter your fibonacci number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = 0;
        int last = 1;
        int fib = 0;
//        System.out.println(first);
        System.out.println(last);
        for (int i = 1; i < number; i++) {
            fib = first + last;
            first = last;
            last = fib;
            System.out.println(fib);
        }


    }
}
