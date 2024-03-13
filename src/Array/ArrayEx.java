package Array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {

        int a[] = {1, 2, 9, 4, 5};

        int array[] = {1, 2, 4, 5};


        Arrays.stream(a).sorted();


        int input = 100;
        boolean isPresent = false;


        for (int i = 0; i < a.length; i++) {
            if (input == a[i]) {
                System.out.println("It is present = " + input);
                isPresent = true;
                break;
            }
        }

        if (!isPresent) {
            System.out.println("It is not present = " + input);
        }

    }
}
