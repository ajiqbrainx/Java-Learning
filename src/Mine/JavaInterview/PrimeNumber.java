package JavaInterview;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNumber(177));

    }

    static String primeNumber(int a) {
        int factor = 0;
        for (int i = 1; i <= a; i++) {
            if ((a % i) == 0) {
                factor += 1;
            }
        }

        if (factor == 2) {
            return "It is Prime Number";
        } else return "Its not a Prime Number";
    }
}
