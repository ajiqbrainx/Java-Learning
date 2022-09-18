package Coding;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 5;
        int fact = 1;
        for (int i = 1; i <= factorial; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
