package Mine.Coding;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacci = 3;
        int first = 0;
        int last = 1;
        int fib = 1;

        for (int i = 1; i <= fibonacci; i++) {
            fib = first + last;
            first = last;
            last = fib;
        }

        System.out.println(first);

    }
}
