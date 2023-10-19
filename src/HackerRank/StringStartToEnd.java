package HackerRank;

import java.util.Scanner;

public class StringStartToEnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        StringBuffer stringBuffer=new StringBuffer();

        for (int i = start; i < end; i++) {
            stringBuffer.append(S.charAt(i));
        }
        System.out.println(stringBuffer);
    }
}
