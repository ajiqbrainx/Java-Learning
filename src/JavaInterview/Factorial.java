package JavaInterview;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    //    static int factor(int a) {
//        int b = 1;
//        int c = 1;
//        if (a >= 1) {
//            System.out.println(b * a);
//            c = b * a;
//            factor(a - 1);
//        }
//        return c;
//    }
    public static long factorial(long n) {
        if (n == 1) return 1;
        else System.out.println(n * factorial(n - 1));
        return (n * factorial(n - 1));
    }
}
