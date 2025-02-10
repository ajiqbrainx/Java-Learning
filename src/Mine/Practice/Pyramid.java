package Mine.Practice;

public class Pyramid {
    public static void main(String[] args) {

        int lines = 5;

        for (int i = 0; i <= lines; i++) {


            for (int j = i; j <= lines; j++) {
                System.out.print("-");
            }

            for (int k = 1; k <= (k * 2 - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//         1 * 2  - 1 = 1
//         2 * 2  - 1 = 3

//        *
//       ***
//      *****
//     *******
//    *********

    }
}
