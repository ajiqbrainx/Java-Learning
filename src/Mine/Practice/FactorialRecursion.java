package Mine.Practice;

public class FactorialRecursion {
    public static void main(String[] args) {

        int output = 1;
        System.out.println(fact(5, output));

    }

    static int fact(int i, int output) {
        if (i != 1) {
            return fact(i - 1, output * i);
        } else return output;
    }
}
