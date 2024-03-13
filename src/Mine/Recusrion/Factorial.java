package Mine.Recusrion;

public class Factorial {
    public static void main(String[] args) {
        int start = 1;
        recursion(5, start);

    }

    static void recursion(int number, int start) {
        if (number > 1) {
//            start = start * number;
            recursion(number - 1, start * number );
        } else {
            System.out.println(start);
        }


    }
}
