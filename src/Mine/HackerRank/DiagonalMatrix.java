package Mine.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int range = scanner.nextInt();
//        List<List<Integer>> arr = new ArrayList<>();
//        for (int i = 0; i < range; i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j < range; j++) {

//                int value = scanner.nextInt();
//                list.add(value);
//            }
//            arr.add(list);
//        }


//        System.out.println(arr);

        List<List<Integer>> arr = Arrays.asList(Arrays.asList(6, 8), Arrays.asList(-6, 9));

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int output = 0;
        int first = 0;
        int last = 0;
        int firstIndex = 0;
        int lastIndex = arr.size() - 1;


        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i).get(firstIndex);
            first = first + value;
            firstIndex = firstIndex + 1;
        }
        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i).get(lastIndex);
            last = last + value;
            lastIndex = lastIndex - 1;
        }

        output = first - last;
        int positiveValue=0;
        if (output < 0) {
             positiveValue = Math.abs(output);
        }else {
            return output;
        }

        return positiveValue;
    }
}
