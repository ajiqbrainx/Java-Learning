package Practice;

import java.util.Scanner;

public class GivenPrime {
    public static void main(String[] args) {
        System.out.println("Enter Your number ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int prime = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                prime++;
            }
        }
        if (prime == 2) {
            System.out.println("Its Prime number");
        } else System.out.println("Its Not Prime number");

    }
}
