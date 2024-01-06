package InterviewPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ");
        Integer number = scanner.nextInt();


        if (primeNumber(number) == 2) {
            System.out.println("Its prime number");
        } else {
            System.out.println("Its not a prime number");
        }
    }
    static int primeNumber(int number){
        if (number == 1) {
            return 2;
        }
        int factor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor++;
            }
        }
        return factor;
    }
}
