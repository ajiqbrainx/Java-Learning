package Mine.HackerRank;
public class PatternMatch {
    public static void main(String[] args) {
        solution("3");
    }

    public static void solution(String n) {
        int num = Integer.parseInt(n);

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            for (int m = 0; m < num - i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            for (int m = 0; m < num - i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

