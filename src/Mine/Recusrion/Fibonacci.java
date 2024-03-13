package Mine.Recusrion;

@FunctionalInterface
interface functional {
    static void aa() {

    }

    void sta();

    default void ss() {

    }


}

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(1, 0, 0, 1));

    }

    static int fib(int input, int output, int first, int second) {

        if (input == 0) {
            return output = first;
        } else if (input == 1) {
            return output = second;
        }
//        else {
//            if ()
//
//        }
        return output;
    }
}
