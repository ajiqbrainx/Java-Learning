package Basics;

public class KrishnamoorthyNumber {
    public static void main(String[] args) {

        int number = 145;


        int sum = 0;
        var output = factorial(number, sum);

        if (output == number) {
            System.out.println("Its is Krisnamoorthy number");
        } else {
            System.out.println("Its is not Krisnamoorthy number");
        }


        System.out.println(output);


    }

    static int factorial(int number, int sum) {
        int rem = 0;
        int value = 1;

        if (number > 0) {
                rem = number % 10;
                number = number / 10;
            while (rem > 0) {
                value = value * rem;
                rem = rem - 1;
            }
            sum = value + sum;
            return factorial(number, sum);
        } else {
            return sum;
        }


    }
}
