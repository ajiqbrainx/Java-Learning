package Mine.Coding;

public class Factors {
    public static void main(String[] args) {
        int factors = 8;
        int rem;

        for (int i = 1; i <= factors; i++) {
            if ((factors % i) == 0) System.out.println(i);
        }
    }

}
