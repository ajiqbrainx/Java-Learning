package Mine.Practice;

import java.util.Locale;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {

        int input = 15;

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int factors = 0;
//
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) {
//                factors++;
//            }
//        }

      var output=  factors(num,0,1);
        if (output == 2) {
            System.out.println(num + " " + " = Its is prime number ");
        } else {
            System.out.println(num + " " + " = Its is not a prime number");
        }

    }

    static int factors(int num, int output, int initial) {

        if (initial <= num) {
            if (num % initial == 0) {
                output++;
            }
         return factors(num,output,initial+1);
        }
        else  return output;

    }
}
