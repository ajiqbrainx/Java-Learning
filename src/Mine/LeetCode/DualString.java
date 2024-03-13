package LeetCode;

public class DualString {
    public static void main(String[] args) {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean output = false;



        if (p.contains(".") || p.contains("*")) {
            output = true;
        }
        System.out.println(output);
    }
}
