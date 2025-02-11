package ETI.Practise;

public class Pyramid {
    public static void main(String[] args) {

        int lines = 15;

        for (int i = 1; i <= lines; i++) {

            for (int j = i; j <= lines; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= (i * 2 - 1); k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
