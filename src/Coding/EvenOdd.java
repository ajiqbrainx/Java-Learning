package Coding;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer>oddList=new ArrayList<>();
        ArrayList<Integer>evenList=new ArrayList<>();
        int oddIterate = 0;
        int evenIterate = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenList.add(array[i]);
                evenIterate++;
            } else {
                oddList.add(array[i]);
                oddIterate++;
            }
        }

        Integer[] odd = oddList.toArray(new Integer[oddList.size()]);
        Integer[] even = evenList.toArray(new Integer[evenList.size()]);


        System.out.println(Arrays.toString(odd));

        System.out.println(Arrays.toString(even));




    }
}
