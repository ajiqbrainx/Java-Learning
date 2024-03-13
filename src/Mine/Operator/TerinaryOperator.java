package Mine.Operator;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class TerinaryOperator {

    Scanner number=new Scanner(System.in);


    int mark=number.nextInt();
    String result=(mark > 45) ? "pass" : "fail";

    public static void main(String[] args) {
        TerinaryOperator terinaryOperator=new TerinaryOperator();
        String s=terinaryOperator.result;
        System.out.println("Enter the number ");
        System.out.println(s);
    }
}
