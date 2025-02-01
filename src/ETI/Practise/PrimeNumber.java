package ETI.Practise;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

//        need to find the factors

        int number = 20;
//        int factors = 0;
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                factors++;
//            }
//        }
//        System.out.println(factors);
//        var output = factors == 2 ? "It is a primeNumber" : "Is is not prime NUmber";
//        System.out.println(output);

        long num= IntStream.rangeClosed(1, number)
                .filter(f -> number % f == 0)
                .count();

        System.out.println(num);
        var output = num == 2 ? "It is a primeNumber" : "Is is not prime NUmber";
        System.out.println(output);
    }

}