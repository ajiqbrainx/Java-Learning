package Practice;

public class ReverseNumber {
    public static void main(String[] args) {
        int a = 123;
        int rem;
        int output = 0;

        while (a != 0) {
            rem = a % 10;
            System.out.println(rem);
            output = (output * 10) + rem;
            a = a / 10;
        }
        System.out.println(output);

    }
}
