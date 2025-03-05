package ETI.Practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        System.out.println();
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(10, 20, 30, 40, 50);
        var mergeList = Stream.concat( list1.stream(), list2.stream()).collect(Collectors.toList());
        System.out.println(mergeList);
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
