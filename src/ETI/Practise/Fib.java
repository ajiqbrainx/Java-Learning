package ETI.Practise;

public class Fib {
    public static void main(String[] args) {
//        0 1 1 2 3 5 8 13
        int length = 5;

        int start = 1;
        int previous = 1;
        int next ;


        for (int i = 1; i <= length; i++) {
            System.out.print(start + " ");
            next = start + previous;
            start = previous;
            previous = next;
        }
    }
}
