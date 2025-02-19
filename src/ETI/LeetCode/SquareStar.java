package ETI.LeetCode;

public class SquareStar {
    public static void main(String[] args) {


        int input = 5;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (i == 1 || i == input) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == input) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.print(" ");


            }
            System.out.println();
        }
    }
}
