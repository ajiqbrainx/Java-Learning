package Practice;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 1, 8};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }


            }

        }
        System.out.println(Arrays.toString(a));
    }
}
