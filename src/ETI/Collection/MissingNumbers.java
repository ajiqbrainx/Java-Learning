package ETI.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumbers {

    static Set<Integer> missingNumbers(int[] array, int start, int end) {

        Set<Integer> output = new HashSet<>();
        for (int i = start; i <= end; i++) {
            for (int k : array) {
                if (i == k) {
                    output.remove(i);
                    break;
                } else {
                    output.add(i);
                }
            }
        }
        return output;

    }

    public static void main(String[] args) {

        int[] array = {6, 7, 9, 10, 1};
        System.out.println("Missing Numbers is " + missingNumbers(array, 0, 100));


    }
}
