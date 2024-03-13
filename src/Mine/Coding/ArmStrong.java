package Mine.Coding;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int ArmStrongCheck = 153;
        int ArmStrong = 153;
        int add = 0;
        int rem = 0;
        int check = 0;
        while (ArmStrong != 0) {
            add = ArmStrong % 10;
            ArmStrong = ArmStrong / 10;
            rem += add * add * add;
        }
        System.out.println(rem);


        if (ArmStrongCheck == rem) System.out.println("Its is ArmStrong Number ..");
        else System.out.println("It is not Armstrong number ..");


    }
}
