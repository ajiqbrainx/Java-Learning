package ETI.Practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {60, 70, 80, 90, 100};

        Arrays.stream(array1).forEach(f -> System.out.print(f + " "));
        System.out.println();
        Arrays.stream(array2).forEach(f -> System.out.print(f + " "));

        System.out.println();
        var mergeArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

        Arrays.stream(mergeArray).forEach(f -> System.out.print(f + " "));
//        legacy way
//        int[] mergeArray = new int[array1.length + array2.length];
//        System.out.println();
//        int index = 0;


//        for (int num : array1) {
//            mergeArray[index] = num;
//            index++;
//        }
//        for (int num : array2) {
//            mergeArray[index] = num;
//            index++;
//        }
//        Arrays.stream(mergeArray).forEach(f -> System.out.print(f + " "));
    }
}
