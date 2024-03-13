package Mine.Practice;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = number;
        int length = String.valueOf(number).length();
        System.out.println(length);

        int rem;
        int armStrong = 1;
        int finalCheck = 0;
        while (number != 0) {
            rem = number % 10;
            for (int i = 1; i <= length; i++) {
                armStrong = armStrong * rem;
            }
            finalCheck += armStrong;
            number = number / 10;
            armStrong = 1;
        }

        if (finalCheck == num){
            System.out.println("Its ArmStrong number");
        }else  System.out.println("Its not ArmStrong number");

    }
}
