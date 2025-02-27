package ETI.Practise;

public class FibPractise {
    public static void main(String[] args) {

        int fib = 5;
//        0 1 1 2 3 5

        int prev = 0;
        int next = 1;
        int countPrevNext;

        for (int i = 0; i <= fib; i++) {
            System.out.print(prev+" ");
            countPrevNext = prev + next;

            prev = next;
            next = countPrevNext;

        }


    }
}
