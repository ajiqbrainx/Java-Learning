package ETI.Practise;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 4, 1};
//        1,3,4

        Arrays.stream(array).forEach(f -> System.out.print(f + " "));
        System.out.println();
        HashSet<Integer> set = new HashSet<>();

        for (int number : array) {
            set.add(number);
        }

        System.out.println(set);
    }
}
