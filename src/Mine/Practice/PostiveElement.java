package Mine.Practice;

import java.util.Arrays;

public class PostiveElement {
    public static void main(String[] args) {
        int[] a = {4,3,1, -1};


        Arrays.sort(a);
        int output = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                if (a[i] == output) {
                    output++;
                }
                else {
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
