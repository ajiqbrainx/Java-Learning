package ETI.Practise;

public class Fibonacci {
    public static void main(String[] args) {

//       fib of 4
//        0,1,1,2,3,5,8

        int fib = 4;
        int addNum;
        int currentNum = 1;
        int previous = 0;
        for (int i = 0; i <= fib; i++) {
            System.out.print(previous + " ");
            addNum = currentNum + previous;
            previous = currentNum;
            currentNum = addNum;
        }
        System.out.println();
        System.out.println(previous);

    }
}
