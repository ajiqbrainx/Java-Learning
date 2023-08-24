package Interview;

import java.util.ArrayList;
import java.util.List;

public class HighestRepeatingElementsCount {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 31, 1, 2, 5, 2, 1, 1, 1};
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int high = 0;
        int sec = 0;


        for (int i = 0; i <= a.length - 1; i++) {
            if (!list.contains(a[i])) {
                for (int j = i; j <= a.length - 1; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }
            }
            list.add(a[i]);
            if (count > high) {
                sec = high;
                high = count;
            } else if (count > sec) {
                sec = count;
            }
            count = 0;
        }


        System.out.println(sec);



    }
}
