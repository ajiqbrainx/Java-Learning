package LeetCode;

public class StringToInteger {
    public static void main(String[] args) {

        String s = "-91283472332";
        long output = 0;
        boolean negative = false;

        for (int i = 0; i < s.length(); i++) {


            if (s.charAt(i) == '-') {
                negative = true;
            }


            if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
                char ss = s.charAt(i);
                int num = ss - '0';
                System.out.println(num);
                output = (output * 10) + num;
            } else if (s.charAt(i) == ' ' || s.charAt(i) == '+' || s.charAt(i) == '-') {
                output = output;
            } else {
                break;
            }
        }

        if (negative) {
            output = -(output);
            System.out.println(output);
        } else {
            System.out.println(output);
        }
    }

}
