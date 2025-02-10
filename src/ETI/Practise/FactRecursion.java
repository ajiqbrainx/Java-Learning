package ETI.Practise;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactRecursion {

    static int fact(int number, int intital, int output) {
        if (number > 0) {
            return fact(number - 1, intital + 1, output * intital);
        }
        return output;
    }

    public static void main(String[] args) {


        int number = 5;
        int fact = 1;

        System.out.println("output is : "+fact(number, fact, 1));



//        for (int i = 1; i <= number; i++) {
//            fact =fact * i;
//        }
//        System.out.println(fact);

//        IntStream.rangeClosed(1,number)
//                .map(f->f*f)
//                .forEach(f-> f+f);


    }
}
