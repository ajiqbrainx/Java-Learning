package Mine.Practice;

public class Recursion {

    static void oneToTen(int range, int start) {

        if (range >= start) {
            System.out.println(start);
            oneToTen(range, start + 1);
        }


    }

    public static void main(String[] args) {


        oneToTen(10, 1);
    }
}
