package Guest;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 11;
        var factors = IntStream.rangeClosed(1, number).filter(f -> number % f == 0).count();
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                factors++;
//            }
//        }
        System.out.println("factors is = " + factors);
        var ss = factors == 2 ? "It is primNumber" : "Not a primeNumber";
        System.out.println(ss);
    }
}
