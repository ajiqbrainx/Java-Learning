package Mine.Practice;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {


        int[] array = {1,33,44,55,66};
        Arrays.sort(array);

        int missingNo = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (missingNo == array[i]) {
                    missingNo++;
                }

            }
        }
        System.out.println(missingNo);
    }
}
