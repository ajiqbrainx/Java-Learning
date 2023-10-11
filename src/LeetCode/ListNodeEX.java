package LeetCode;

import java.util.LinkedList;

public class ListNodeEX {


    public static void main(String[] args) {

        int[] value1 = {2,4, 3};
        int[] value2 = {5, 6,4};


        int first = 0;
        int second = 0;
        int third = 0;
        int rem = 0;
        int output = 0;

        for (int i = value1.length - 1; i >= 0; i--) {
            first = (first * 10) + value1[i];
        }
        for (int i = value2.length - 1; i >= 0; i--) {
            second = (second * 10) + value2[i];
        }
        third = first + second;

        while (third != 0) {
            rem = third % 10;

            output = (output * 10) + rem;
            third = third / 10;
        }

        System.out.println(output);

    }
}

