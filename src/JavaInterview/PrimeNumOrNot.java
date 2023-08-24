package JavaInterview;

public class PrimeNumOrNot {
    public static void main(String[] args) {

        int a = 477;
        int prime = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                prime++;
            }
        }
        if (prime == 2) {
            System.out.println("It is prime number");
        } else System.out.println("It is not prime number");
    }
}
