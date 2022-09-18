package Coding;

public class PrimeNumbers {
    public static void main(String[] args) {
        int factors = 15;
        int primeNumber = 2;
        int check = 0;
        for (int i = 1; i <= factors; i++) {
            if (factors % i == 0) check += 1;
        }
        if (primeNumber == check) System.out.println(factors  + " = Its is primeNumber...");
        else System.out.println(factors  + " = Its not a PrimeNumber...");
    }
}
