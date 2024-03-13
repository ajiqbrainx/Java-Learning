package Mine.Practice;

public class ReverseInt {
    public static void main(String[] args) {

        int number = 123;

        int rem;
        int reverse = 0;


        while (number != 0) {
            rem = number % 10;
            reverse = (reverse * 10) + rem;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
