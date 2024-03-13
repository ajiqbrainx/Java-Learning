package Mine.Interview;

public class Fibonacii {
    public static void main(String[] args) {

        int input = 5;
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= input; i++) {
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;
        }



    }
}
