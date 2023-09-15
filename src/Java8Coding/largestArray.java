package Java8Coding;

import java.util.Arrays;


public class largestArray {
    public static void main(String[] args) {

        int a[] = {12, 333, 4, 45, 67};



        System.out.println(Arrays.stream(a).max());
        System.out.println(Arrays.stream(a).min());



    }
}
