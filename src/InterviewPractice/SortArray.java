package InterviewPractice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int array[] = {2, 4, 1};
        int array1[] = {9, 3, 4};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));

        int newArray[] = new int[array.length + array1.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        int length = array.length ;

        for (int i = 0; i < array1.length; i++) {
            newArray[length] =array1[i];
            length++;
        }
        System.out.println(Arrays.toString(newArray));

        int temp;

        for (int i = 0; i < newArray.length; i++) {

            for (int j = i + 1; j < newArray.length; j++) {

                if (newArray[i] > newArray[j]) {
                    temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
