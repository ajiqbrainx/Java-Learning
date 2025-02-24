package ETI.LeetCode;

public class PyramidNumber {
    public static void main(String[] args) {

        int input = 4;

        int increase = 1;
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(increase+" ");
                increase++;
            }
            System.out.println();
        }
    }
}
