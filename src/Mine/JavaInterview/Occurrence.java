package JavaInterview;

import java.util.ArrayList;
import java.util.List;

public class Occurrence {
    public static void main(String[] args) {
        int[] array = {12, 2, 3, 2, 1, 2, 1, 12, 5, 6,12, 2, 3, 2, 1, 2, 1, 12, 5, 6,1,1,1,1,1,1,3,1,1,1,1,11,11,6};
        List<Integer> list = new ArrayList<>();


        int occurrence = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if(!list.contains(array[i])){
                for (int j = i; j <= array.length - 1; j++) {
                    if (array[i] == array[j]) {
                        occurrence++;
                    }
                }

                System.out.println(array[i] + " occurrence is = " + occurrence);
            }
            list.add(array[i]);

            occurrence = 0;
        }
    }
}
