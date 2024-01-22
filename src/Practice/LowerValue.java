package Practice;

public class LowerValue {
    public static void main(String[] args) {
        int[] a = {7, 2, 3, 4, 6};
        int b = a[0];
        int c = a[0];
        for (int i = 0; i < a.length; i++) {
            if (b > a[i]) {
                b = a[i];
            }
            if (c > a[i] && b != a[i]) {
                c = a[i];
            }
        }
//        for (int i = 0; i < a.length; i++) {
//
//        }
        System.out.println(b);
        System.out.println(c);
    }
}
