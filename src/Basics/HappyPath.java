package Basics;

import java.util.ArrayList;
import java.util.List;

public class HappyPath {
    public static void main(String[] args) {

        int number = 133;
        List<Integer> list = new ArrayList<>();
        var output = happyNumber(number, list);
        if (output == 1) {
            System.out.println("Its a happy number");
        } else {
            System.out.println("Its not a happy number");
        }
    }

    static int happyNumber(int number, List<Integer> list) {


        int rem = 0;
        int sum = 0;
        if (list.contains(number)) {
            return number;
        }
        list.add(number);
        while (number > 0) {
            rem = number % 10;
            sum = sum + (rem * rem);
            number = number / 10;
        }
        if (sum == 1) {
            return 1;
        } else {
            number = sum;
            sum = 0;
            rem = 0;
            return happyNumber(number, list);
        }


    }
}
