package Mine.Practice;

public class Fib {
    public static void main(String[] args) {
        int first = 0;
        int last = 1;
        int input = 3;
        int output;

        System.out.println(first);
        System.out.println(last);
        for (int i = 2; i < input; i++) {
            output = first + last;
            System.out.println(output);
            first = last;
            last = output;

        }

    }
}
