package ETI.Practise;

import java.util.stream.IntStream;

public class ArmStrong {
    public static void main(String[] args) {

//        (1^{3}+5^{3}+3^{3}=153)

        int number = 153;
        int lastCheck = number;
        int last;
        int count = 0;

        while (number > 0) {
            last = number % 10;
            count = count + (last * last * last);
            number = number / 10;
        }
        System.out.println(count);
        System.out.println(lastCheck);
        var output = count == lastCheck ? "It is Armstrong Number " : "Its not a Armstrong Number";
        System.out.println(output);

        int numberString = 153;

        int out = String.valueOf(numberString)
                .chars()
                .map(Character::getNumericValue)
                .map(f -> f * f * f)
                .sum();

        System.out.println(out);

    }
}
