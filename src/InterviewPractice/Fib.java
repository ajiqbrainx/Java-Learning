package InterviewPractice;

public class Fib {
    public static void main(String[] args) {

        int a;
        int b = 0;
        int c = 1;
        int num = 10;
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
            if (i == num - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + " , ");
            }

        }
    }
}
