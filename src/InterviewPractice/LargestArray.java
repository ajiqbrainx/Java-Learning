package InterviewPractice;

import java.util.Arrays;

public class LargestArray {
    public static void main(String[] args) {

        int array[] = {4, 5};


        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i]>secondMax && array[i]!= max)
            {
                secondMax=array[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }
}
