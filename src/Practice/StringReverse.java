package Practice;

public class StringReverse {
    public static void main(String[] args) {
//        String name = "Ajith";
//        String rev = "";
//
//        for (int i = name.length() - 1; i >= 0; i--) {
//            rev = rev + name.charAt(i);
//        }
//        System.out.println(rev);
//        if (name.equals(rev)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        int number = 123;
        int rem = 0;
        int rev = 0;
        for (int i = number; number > 0; i = number) {
            rem = number % 10;
            System.out.println(rem);
            rev = number / 10;
            System.out.println(rev);
            number = rev;
//            i=number;
        }
//        System.out.println(rev);

    }
}
