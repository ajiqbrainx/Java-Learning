package Mine.Practice;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the factorial Number ");
       int factorial= scanner.nextInt();

        System.out.println(  fact(factorial,1,1));


    }

   static int fact(int factorial, int start, int output) {
        if (start <= factorial) {
            output = output * start;
            return fact(factorial, start + 1, output);
        }
        else return output;
    }
}
