package ETI.Practise;


import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
//        5 => 5*4*3*2*1 ;

        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("factorial " + number + "  is " + fact);

        int value = IntStream.rangeClosed(1, number)
                .reduce(1, (a, b) -> a * b);

        System.out.println(value);


    }
}
