package Basics;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            if(x<100) System.out.println(s1+"           "+"0"+x);
            else System.out.println(s1+"           "+x);
            //Complete this line
        }
        System.out.println("================================");

    }
}
