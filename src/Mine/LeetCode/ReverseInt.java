package LeetCode;

public class ReverseInt {
    public static void main(String[] args) {
        int x = 1534236469;
        int num = Math.abs(x);
        long output = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            output = (output * 10) + rem;
            num = num / 10;
        }
        if (x < 0) {
            output = -(output);
        }
        if (num >=2147483647){
            output=0;
        }


        System.out.println(output);

//        else if (x > 2147483647) {
//            output = 0;
//        }


    }
}
