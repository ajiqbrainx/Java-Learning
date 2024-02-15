package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int aa = 153;
        int iteration = 0;
        int rem = 0;
        int que = 0;
        List<Integer> list = new ArrayList<>();

        int output = 0;


        while (aa > 0) {
            iteration++;
            rem = aa % 10;
            list.add(rem);
            que = (que * 10) + rem;
            aa = aa / 10;
        }
        for (int i = 0; i < list.size(); i++) {
            int value = 1;
            for (int j = 1; j <= iteration; j++) {
                value = list.get(i) * value;
            }
            output = output + value;
        }

        System.out.println(output);

        if (output == aa) {
            System.out.println("Its Arm strong number");
        } else {
            System.out.println("Its Arm strong number");
        }
    }
}
