package Recusrion;

public class Factorial {
    public static void main(String[] args) {
        int start = 1;
        recursion(6, start);

    }

    static void recursion(int number, int start) {

        if (number != 1) {
            recursion(number - 1, start * number);
        }else {
            System.out.println(start);
        }


    }
}
