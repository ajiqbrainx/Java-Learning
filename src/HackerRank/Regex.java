package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value ");

        while (in.hasNext()){
            String regex = "^(00[0-9]|0[0-9]{2}|[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(00[0-9]|0[0-9]{2}|[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(00[0-9]|0[0-9]{2}|[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.(00[0-9]|0[0-9]{2}|[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
            String value = in.next();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }












    }


}
