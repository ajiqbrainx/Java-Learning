package Practice;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter your fibonacci number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int first = 1;
        int last = 1;
        int fib = 0;
        if(number==1 || number==2){
            System.out.println(1);
        }
        else {
            for (int i = 3; i <= number; i++) {
                fib = first + last;
                first = last;
                last = fib;
            }
            System.out.println(fib);
        }



    }
}
