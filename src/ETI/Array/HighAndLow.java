package ETI.Array;

import jdk.jshell.EvalException;

import java.util.Arrays;

public class HighAndLow {
    public static void main(String[] args) {

        int array[] = {11, 22, 332, 11, 4, 5};
           var value= Arrays.stream(array).max();

        System.out.println(value.getAsInt());
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
