package ETI.Practise;

public class PrimeOrNot {

    static void primeOrNot(int input) {

        int factors = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                factors++;
            }
        }

        if (factors == 2) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }

    }

    public static void main(String[] args) {

        primeOrNot(-17);
    }
}
