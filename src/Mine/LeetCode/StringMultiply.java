package LeetCode;

import java.math.BigInteger;

public class StringMultiply {


    public static void main(String[] args) {

        String num1 = "498828660196";
        String num2 = "840477629533";


        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);

        var ss = bigInteger1.multiply(bigInteger2);
        String output = ss.toString();
        System.out.println(output);
    }


}
