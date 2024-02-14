package HackerRank;

public class FizzBuzz {
    public static void main(String[] args) {

        int n = 15;

        for (int i = 1; i <= n; i++) {

            boolean value = true;
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
                value = false;
            }
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
                value = false;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
                value = false;
            }

            if (value) {
                System.out.println(i);
            }

            value = true;
        }
    }
}
