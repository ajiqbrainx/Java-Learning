package ETI.Practise;

public class PyramidHalf {
    public static void main(String[] args) {


        int numbers = 5;

        char print = '*';

        for (int i = 1; i <= numbers; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(print +" ");
            }
            System.out.println();
        }


    }
}
