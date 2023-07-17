package JavaInterview;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        withoutLoop(1, scanner.nextInt());
    }

    static void withoutLoop(int n, int i) {
        if (n <= i) {
            System.out.println(n);
            withoutLoop(n + 1, i);
        }

    }
}
