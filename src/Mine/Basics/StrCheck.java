package Mine.Basics;

public class StrCheck {
    public static void main(String[] args) {

        String a1 = "ebc";
        String a2 = "efd";

        boolean output = false;

        if (((a1.charAt(0) == a1.charAt(1)) && (a2.charAt(0) == a2.charAt(1))) || ((a1.charAt(1) == a1.charAt(2)) && (a2.charAt(1) == a2.charAt(2)))){
            output = true;
        }

        System.out.println(output);
    }
}
