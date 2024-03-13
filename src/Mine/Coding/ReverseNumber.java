package Mine.Coding;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        int rev = 0;
        int rem ;
        while (number != 0) {
            rem = number % 10;    //First 12.3   3 is storing to the
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        System.out.println(rev);
    }
}
